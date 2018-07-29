package br.kennedysdias.events.ui.main

import android.app.ActivityOptions
import android.arch.lifecycle.Observer
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.widget.ImageView
import android.widget.TextView
import br.kennedysdias.data.EventModel
import br.kennedysdias.events.R
import br.kennedysdias.events.ui.detail.DetailActivity
import br.kennedysdias.events.ui.detail.EXTRA_EVENT_MODEL
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import org.koin.android.architecture.ext.viewModel
import android.util.Pair as UtilPair

class MainActivity : AppCompatActivity() {

	private val viewModel by viewModel<MainViewModel>()
	private var eventsListAdapter: EventsListAdapter? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		configureToolbar()
		configureRecyclerView()
		configureFab()
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
		eventsListAdapter = EventsListAdapter(mutableListOf(), ::openDetail)
		recyclerViewEvents.apply {
			layoutManager = LinearLayoutManager(context)
			adapter = eventsListAdapter
		}
	}

	private fun configureFab() {
		floatingActionButton.setOnClickListener {
			toast("FAB clicked")
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

	private fun openDetail(
			eventModel: EventModel,
			imageViewBackground: ImageView,
			textViewName: TextView,
			textViewCategory: TextView) {

		val options = ActivityOptions.makeSceneTransitionAnimation(this,
				UtilPair.create(imageViewBackground, "imageViewBackground"),
				UtilPair.create(textViewName, "textViewName"),
				UtilPair.create(textViewCategory, "textViewCategory"))

		val newIntent = Intent(this, DetailActivity::class.java)
		newIntent.putExtra(EXTRA_EVENT_MODEL, eventModel)
		startActivity(newIntent, options.toBundle())
	}

}
