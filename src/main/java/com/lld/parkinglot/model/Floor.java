package com.lld.parkinglot.model;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import Exception.NoParkingSpotFound;

public class Floor {

	private Integer floorNumber;
	
	private Map<Integer, ParkingSpot> parkingSpots;

	public Floor() {
		parkingSpots = new ConcurrentHashMap<>();
	}

	public Integer getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(Integer floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Map<Integer, ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}

	public void setParkingSpots(Map<Integer, ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}

	
	public void addParkingSpot(int numberOfSpot, ParkingSpotType parkingSpotType) {
		
		for(int i=0;i<numberOfSpot;i++) {
			int parkingId = parkingSpots.size() + 1;
			ParkingSpot parkingSpot = ParkingSpotFactory.getParkingSpotObject(parkingSpotType);
			parkingSpots.put(parkingId, parkingSpot);
		}
	}
	public void removeParkingSpot(int parkingId) throws NoParkingSpotFound {
		
		if(parkingSpots.containsKey(parkingId)) {
			parkingSpots.remove(parkingId);
		}
		else {
			throw new NoParkingSpotFound();
		}
	}
	
	
}
