package br.kennedysdias.events.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import br.kennedysdias.appdata.Data
import br.kennedysdias.appdata.EventModel

class MainViewModel : ViewModel() {

	val listObservable: MutableLiveData<EventsListState> = MutableLiveData()

	fun getList() {
		try {
			listObservable.value = EventsListState.Success(Data.eventList)
		} catch (e: Exception) {
			listObservable.value = EventsListState.Error("Could not process data")
		}
	}

	sealed class EventsListState {
		data class Success(val list: MutableList<EventModel>) : EventsListState()
		data class Error(val message: String) : EventsListState()
	}

}
