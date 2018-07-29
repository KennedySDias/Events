package br.kennedysdias.events.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.kennedysdias.data.EventModel
import br.kennedysdias.events.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list_events.view.*

class EventsListAdapter(
		val list: MutableList<EventModel>
) : RecyclerView.Adapter<ViewHolder>() {

	override fun onCreateViewHolder(viewGroup: ViewGroup, item: Int) =
			ViewHolder(
					LayoutInflater
							.from(viewGroup.context)
							.inflate(R.layout.item_list_events, viewGroup, false))

	override fun getItemCount() =
			list.size

	override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
		viewHolder.bind(list[position])
	}

}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

	fun bind(item: EventModel) = with(itemView) {
		Glide
				.with(context)
				.load(item.image)
				.into(imageViewBackground)

		textViewName.text = item.name
		textViewCategory.text = item.category


	}

}