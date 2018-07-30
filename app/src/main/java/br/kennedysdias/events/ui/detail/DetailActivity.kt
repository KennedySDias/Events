package br.kennedysdias.events.ui.detail

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import br.kennedysdias.appdata.EventModel
import br.kennedysdias.events.R
import br.kennedysdias.events.ui.components.WGBounceInterpolator
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*


const val EXTRA_EVENT_MODEL = "ExtraEventModel"

class DetailActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_detail)

		configureToolbar()
		renderUI()
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		return when (item.itemId) {
			android.R.id.home -> {
				onBackPressed()
				true
			}
			else -> super.onOptionsItemSelected(item)
		}
	}

	override fun onBackPressed() {
		hideButtonsAndFinish()
	}

	private fun configureToolbar() {
		setSupportActionBar(toolbar)
		supportActionBar?.let {
			it.setDisplayShowHomeEnabled(true)
			it.setDisplayHomeAsUpEnabled(true)
			it.title = ""
		}
	}

	private fun renderUI() {
		if (intent.hasExtra(EXTRA_EVENT_MODEL)) {

			val model = intent.getParcelableExtra<EventModel>(EXTRA_EVENT_MODEL)

			Glide.with(this)
					.load(model.image)
					.into(imageViewBackground)

			textViewName.text = model.name
			textViewCategory.text = model.category
			textViewDate.text = model.date
			textViewAddress.text = model.address

			startAnimations()
		}
	}

	private fun startAnimations() {
		showButtons()
		showTexts()
	}

	private fun showTexts() {
		textViewDate.animate()
				.setStartDelay(400)
				.alpha(1f)
				.setDuration(400L)
				.start()

		textViewAddress.animate()
				.setStartDelay(400)
				.alpha(1f)
				.setDuration(400L)
				.start()
	}

	private fun showButtons() {
		showFloatingButton(fab01, 800L)
		showFloatingButton(fab02, 900L)
		showFloatingButton(fab03, 1000L)
		showFloatingButton(fab04, 1100L)
		showFloatingButton(fab05, 1200L)
	}

	private fun hideButtonsAndFinish() {
		hideFloatingButton(fab01, 200L)
		hideFloatingButton(fab02, 300L)
		hideFloatingButton(fab03, 400L)
		hideFloatingButton(fab04, 500L)
		hideFloatingButton(fab05, 600L)
	}

	private fun showFloatingButton(fab: FloatingActionButton, startDelay: Long) {
		fab.animate()
				.setStartDelay(startDelay)
				.alpha(1f)
				.setDuration(600L)
				.translationY(-40f)
				.setInterpolator(WGBounceInterpolator())
				.start()
	}

	private fun hideFloatingButton(fab: FloatingActionButton, startDelay: Long) {
		fab.animate()
				.setStartDelay(startDelay)
				.alpha(0f)
				.setDuration(600L)
				.translationY(0f)
				.withEndAction {
					finishAfterTransition()
				}
				.start()
	}


}
