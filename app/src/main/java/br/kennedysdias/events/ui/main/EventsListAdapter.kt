package br.kennedysdias.events.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import br.kennedysdias.appdata.EventModel
import br.kennedysdias.events.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list_events.view.*

class EventsListAdapter(
		val list: MutableList<EventModel>,
		private val onClickItem: (EventModel, ImageView, TextView, TextView) -> Unit
) : RecyclerView.Adapter<ViewHolder>() {

	override fun onCreateViewHolder(viewGroup: ViewGroup, item: Int) =
			ViewHolder(
					LayoutInflater
							.from(viewGroup.context)
							.inflate(R.layout.item_list_events, viewGroup, false))

	override fun getItemCount() =
			list.size

	override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
		viewHolder.bind(list[position], onClickItem)
	}

}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

	fun bind(
			item: EventModel,
			onClickItem: (EventModel, ImageView, TextView, TextView) -> Unit
	) = with(itemView) {

		Glide
				.with(context)
				.load(item.image)
				.into(imageViewBackground)

		textViewName.text = item.name
		textViewCategory.text = item.category

		layoutParent.setOnClickListener {
			onClickItem(item, imageViewBackground, textViewName, textViewCategory)
		}
	}

}