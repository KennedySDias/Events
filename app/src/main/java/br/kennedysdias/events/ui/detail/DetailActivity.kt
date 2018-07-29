package br.kennedysdias.events.ui.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.kennedysdias.events.R

const val EXTRA_EVENT_MODEL = "ExtraEventModel"

class DetailActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_detail)

	}

}
