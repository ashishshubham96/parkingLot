package com.lld.parkinglot.service;

import com.lld.parkinglot.model.ParkingSpot;
import com.lld.parkinglot.model.ParkingSpotType;
import com.lld.parkinglot.model.ParkingSystem;

import Exception.NoParkingSpotFound;

public abstract class Parking {
	
	private ParkingSystem parkingSystem;

	public abstract ParkingSpot findParkingSpot(String parkingSpotType) throws NoParkingSpotFound;
	
	
	
}
