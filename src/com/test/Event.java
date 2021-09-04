package com.test;

public class Event {

	private int eventId;
	private String eventName;
	private String eventDesc;
	private String eventDate;
	private String eventTime;

	public Event() {

	}

	public boolean checkNulls() {
		return this.eventName != null && this.eventDesc != null && this.eventDate != null;
	}

	public Event(int eventId, String eventName, String eventDesc, String eventDate, String eventTime) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDesc = eventDesc;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.eventId + " " + this.eventName + " " + this.eventDesc + " " + this.eventDate + " " + this.eventTime;
	}

}
