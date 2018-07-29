package br.kennedysdias.appdata

import java.util.*

object Data {

	val eventList: MutableList<EventModel>
		get() {
			val list = ArrayList<EventModel>()
			list.add(EventModel(
					1,
					"https://images.unsplash.com/photo-1504681869696-d977211a5f4c?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=63c3a5c20980338cb4c2df32fd5c8039&auto=format&fit=crop&w=562&q=80",
					"Event 01",
					"Category 01",
					"January 1 - 3, 2018 - 20:00",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					2,
					"https://images.unsplash.com/photo-1503079230625-8a7c589a9007?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=dbc925c175cbdf71252925e3a0f8f4ee&auto=format&fit=crop&w=562&q=80",
					"Event 02",
					"Category 02",
					"February 04 - 5, 2018 - 17:45",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					3,
					"https://images.unsplash.com/photo-1506084868230-bb9d95c24759?ixlib=rb-0.3.5&s=ffe197e522fc7872d5ee1c70eb3502d1&auto=format&fit=crop&w=668&q=80",
					"Event 03",
					"Category 03",
					"March 1 - 2, 2017 - 21:00",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					4,
					"https://images.unsplash.com/photo-1504217051514-96afa06398be?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=f3a7184318f7a415677aa77e6dc623e7&auto=format&fit=crop&w=668&q=80",
					"Event 04",
					"Category 04",
					"April 22 - 22, 2017 - 08:00",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					5,
					"https://images.unsplash.com/photo-1506610382288-61289fe4080a?ixlib=rb-0.3.5&s=fd274d5ffacea0f075105766e7d32172&auto=format&fit=crop&w=2468&q=80",
					"Event 04",
					"Category 04",
					"May 16 - 19, 2018 - 12:00",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					6,
					"https://images.unsplash.com/photo-1506924365419-79a02a1132e9?ixlib=rb-0.3.5&s=5c8abcec30e5e013e6354fb0e638806f&auto=format&fit=crop&w=2322&q=80",
					"Event 01",
					"Category 01",
					"June 24 - 27, 2018 - 22:00",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					7,
					"https://images.unsplash.com/photo-1509923555566-751e49437cd2?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b492fd1366c144d7dae922fcaee71bbb&auto=format&fit=crop&w=668&q=80",
					"Event 05",
					"Category 05",
					"July 1 - 10, 2018 - 23:00",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					8,
					"https://images.unsplash.com/photo-1499262222376-d10eb3d5183f?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=9595454c59fe24e034539a349292d643&auto=format&fit=crop&w=564&q=80",
					"Event 06",
					"Category 06",
					"August 4 - 4, 2018 - 20:00",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					9,
					"https://images.unsplash.com/photo-1502988632461-f68f5b4f415a?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=62f374f402c312b31598298247451da1&auto=format&fit=crop&w=668&q=80",
					"Event 07",
					"Category 07",
					"August 16 - 19, 2018 - 15:00",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					10,
					"https://images.unsplash.com/photo-1506456102743-e0d79296b35c?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=2eb1dcee17514840457c6c34abb93114&auto=format&fit=crop&w=716&q=80",
					"Event 07",
					"Category 07",
					"September 7 - 8, 2018 - 20:00",
					"Quem Elizabeth Olympic Park London, GB"
			))
			list.add(EventModel(
					1,
					"https://images.unsplash.com/photo-1455305049585-41b8d277d68a?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=9a267fdb30b5d7414a3f00f3068b4b68&auto=format&fit=crop&w=668&q=80",
					"Event 07",
					"Category 07",
					"September 10 - 19, 2018 - 20:00",
					"Quem Elizabeth Olympic Park London, GB"
			))

			return list
		}

}
