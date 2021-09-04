package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		List<Event> eventList = new ArrayList<>();
		eventList.add(new Event(1, null, null, "09/04/21", "11:31"));
		eventList.add(new Event(2, "event1", null, "09/03/21", "15:31"));
		eventList.add(new Event(1, null, "desc", "09/04/21", "11:31"));
		eventList.add(new Event(1, "event2", "desc2", "09/04/21", "11:31"));
		eventList.add(new Event(1, "event3", "desc3", "09/06/21", null));
		eventList.add(new Event(1, "event4", null, "09/04/21", "11:31"));
		filterEventList(eventList);
	}

	private static void filterEventList(List<Event> eventList) {
		// convertStringToDate("09/05/21", "22:31");
		List<Event> filterList = eventList.stream().filter(event -> event.checkNulls())
				.filter(event -> convertStringToDate(event.getEventDate(),
						event.getEventTime() == null ? "00:00" : event.getEventTime()).after(new Date()))
				.collect(Collectors.toList());

		System.out.println(filterList);

	}

	private static Date convertStringToDate(String date, String time) {
		try {
			DateFormat formater = new SimpleDateFormat("MM/dd/yy HH:mm");
			return formater.parse(date + " " + time);
			// System.out.println(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
