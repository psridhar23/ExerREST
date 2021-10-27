package com.practice.objects;

public class Hotel {
	
	private String uuid;
	private String name;
	private Address address;
	private HotelType hotelType;
	
	public Hotel(String uid, String name, Address addr, HotelType hotelType) {
		this.uuid = uid;
		this.name = name;
		this.address = addr;
		this.hotelType = hotelType;
	}
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public HotelType getHotelType() {
		return hotelType;
	}
	public void setHotelType(HotelType hotelType) {
		this.hotelType = hotelType;
	}

}
