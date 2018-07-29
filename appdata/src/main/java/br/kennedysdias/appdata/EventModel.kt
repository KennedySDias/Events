package br.kennedysdias.appdata

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class EventModel(
		var id: Int,
		var image: String,
		var name: String,
		var category: String,
		var date: String,
		var address: String
) : Parcelable
