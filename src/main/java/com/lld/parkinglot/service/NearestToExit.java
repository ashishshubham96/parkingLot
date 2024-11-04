package com.lld.parkinglot.service;

import java.util.Map;

import com.lld.parkinglot.model.Floor;
import com.lld.parkinglot.model.ParkingSpot;
import com.lld.parkinglot.model.ParkingSpotType;
import com.lld.parkinglot.model.ParkingSystem;

import Exception.NoParkingSpotFound;

public class NearestToExit extends Parking{

	@Override
	public ParkingSpot findParkingSpot(String parkingSpotType) throws NoParkingSpotFound {
		ParkingSystem parkingSystem = ParkingSystem.getParkingSystemInstance();
		
		Map<Integer, Floor> floors = parkingSystem.getFloors();
		
		for(Integer floor : floors.keySet()) {
			Map<Integer, ParkingSpot> parkingSpots = floors.get(floor).getParkingSpots();
			for(Integer parkingId : parkingSpots.keySet()) {
				if(parkingSpots.get(parkingId).isFree() && parkingSpots.get(parkingId).getParkingSpotType().toString().equals(parkingSpotType) ) {
					return parkingSpots.get(parkingId);
				}
			}
		}
		throw new NoParkingSpotFound();
	}

}
