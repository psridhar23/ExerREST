package com.practice.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.practice.objects.Address;
import com.practice.objects.Hotel;
import com.practice.objects.HotelType;

@Path("/hello")
public class HelloWorldController {
	
	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelloWorldText() {
		String helloWorld = "";
		helloWorld = "Hello World!";
		return helloWorld;
	}
	
	@GET
	@Path("/getHotel")
	@Produces(MediaType.APPLICATION_JSON) 
	public Hotel getHotel() {
		Address addr = new Address("1212","Smith Street","","","Waltham","02453","U.S.A");
		Hotel hotel = new Hotel("fargg12134nkgsdg","The Ritz",addr,HotelType.ROOMS);
		return hotel;
	}

}
