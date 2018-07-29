package br.kennedysdias.events.di

import br.kennedysdias.events.ui.main.MainViewModel
import org.koin.android.architecture.ext.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

val myViewModules: Module = applicationContext {
	viewModel { MainViewModel() }
}