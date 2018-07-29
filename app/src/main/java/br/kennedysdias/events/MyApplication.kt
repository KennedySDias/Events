package br.kennedysdias.events

import android.app.Application
import br.kennedysdias.events.di.myViewModules
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {
	override fun onCreate() {
		super.onCreate()

		// Start Koin
		startKoin(this, listOf(myViewModules))
	}
}