package br.kennedysdias.data;

import java.util.ArrayList;
import java.util.List;

public class Data {

	public static List<EventModel> getEventList() {
		final List<EventModel> list = new ArrayList<>();
		list.add(new EventModel(
				1,
				"https://cdn.pixabay.com/photo/2017/07/21/23/57/concert-2527495_960_720.jpg",
				"Event 01",
				"Category 01",
				"10-10-2018",
				"Address"
		));
		list.add(new EventModel(
				1,
				"https://cdn.pixabay.com/photo/2015/09/18/11/34/fireworks-945386_960_720.jpg",
				"Event 02",
				"Category 02",
				"10-10-2018",
				"Address"
		));
		list.add(new EventModel(
				1,
				"https://cdn.pixabay.com/photo/2016/01/19/18/02/concerts-1150042_960_720.jpg",
				"Event 03",
				"Category 03",
				"10-10-2018",
				"Address"
		));
		list.add(new EventModel(
				1,
				"https://cdn.pixabay.com/photo/2017/08/08/00/17/events-2609526_960_720.jpg",
				"Event 04",
				"Category 04",
				"10-10-2018",
				"Address"
		));
		list.add(new EventModel(
				1,
				"https://cdn.pixabay.com/photo/2017/04/25/22/22/color-2261009_960_720.jpg",
				"Event 04",
				"Category 04",
				"10-10-2018",
				"Address"
		));
		list.add(new EventModel(
				1,
				"https://cdn.pixabay.com/photo/2016/11/09/21/28/exclusive-banquet-1812772_960_720.jpg",
				"Event 01",
				"Category 01",
				"10-10-2018",
				"Address"
		));
		list.add(new EventModel(
				1,
				"https://cdn.pixabay.com/photo/2015/01/16/15/00/concert-601537_960_720.jpg",
				"Event 05",
				"Category 05",
				"10-10-2018",
				"Address"
		));
		list.add(new EventModel(
				1,
				"https://cdn.pixabay.com/photo/2016/09/26/16/16/festival-1696329_960_720.jpg",
				"Event 06",
				"Category 06",
				"10-10-2018",
				"Address"
		));
		list.add(new EventModel(
				1,
				"https://cdn.pixabay.com/photo/2016/12/29/15/24/juggler-1938714_960_720.jpg",
				"Event 07",
				"Category 07",
				"10-10-2018",
				"Address"
		));

		return list;
	}

}
