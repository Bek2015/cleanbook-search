package com.bookhotel.entity;

public class Room {

	private Integer roomId;
	private String roomNumber;
	private String roomName;
	private String roomType;
	private Integer floor;
	private boolean smokingAllowed;
	private boolean isAvailable;
	
	public Room() {
		super();
	}
	
	public Room(Integer roomId, String roomNumber, String roomName, String roomType, Integer floor,
			boolean smokingAllowed, boolean isAvailable) {
		super();
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.roomName = roomName;
		this.roomType = roomType;
		this.floor = floor;
		this.smokingAllowed = smokingAllowed;
		this.isAvailable = isAvailable;
	}
	
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public boolean isSmokingAllowed() {
		return smokingAllowed;
	}
	public void setSmokingAllowed(boolean smokingAllowed) {
		this.smokingAllowed = smokingAllowed;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
