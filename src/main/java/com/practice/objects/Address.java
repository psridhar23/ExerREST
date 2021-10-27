package com.practice.objects;

public class Address {
	
	private String streetNum;
	private String street;
	private String addrLine2;
	private String addrLine3;
	private String city;
	private String postalCode;
	private String country;
	
	public Address(String str1, String str2, String aline2, String aline3, String city, String pCode, String ctry) {
		this.streetNum = str1;
		this.street = str2;
		this.addrLine2 = aline2;
		this.addrLine3 = aline3;
		this.city = city;
		this.postalCode = pCode;
		this.country = ctry;
	}
	
	public String getStreetNum() {
		return streetNum;
	}
	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	public String getAddrLine3() {
		return addrLine3;
	}
	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
