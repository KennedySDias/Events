package br.kennedysdias.events.ui.main

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import br.kennedysdias.data.EventModel
import br.kennedysdias.events.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.architecture.ext.viewModel

class MainActivity : AppCompatActivity() {

	private val viewModel by viewModel<MainViewModel>()
	private var eventsListAdapter: EventsListAdapter? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		configureToolbar()
		configureRecyclerView()
		configureObservables()

		viewModel.getList()
	}

	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		menuInflater.inflate(R.menu.main, menu)
		return super.onCreateOptionsMenu(menu)
	}

	private fun configureToolbar() {
		setSupportActionBar(toolbar)
		supportActionBar?.setIcon(R.drawable.ic_search)
	}

	private fun configureRecyclerView() {
		eventsListAdapter = EventsListAdapter(mutableListOf())
		recyclerViewEvents.apply {
			layoutManager = LinearLayoutManager(context)
			adapter = eventsListAdapter
		}
	}

	private fun configureObservables() {
		viewModel.listObservable.observe(this, Observer { handleListState(it) })
	}

	private fun handleListState(state: MainViewModel.EventsListState?) {
		state?.let {
			when (it) {
				is MainViewModel.EventsListState.Success -> {
					renderList(it.list)
				}
				is MainViewModel.EventsListState.Error -> {
//					snackbar(layoutParent, it.message)
				}
			}
		}
	}

	private fun renderList(list: List<EventModel>) {
		eventsListAdapter?.let {
			it.list.addAll(list)
			it.notifyDataSetChanged()
		}
	}

}
