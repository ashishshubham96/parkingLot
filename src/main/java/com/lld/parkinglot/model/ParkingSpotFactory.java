package com.lld.parkinglot.model;

public class ParkingSpotFactory {

	public static ParkingSpot getParkingSpotObject(ParkingSpotType parkingSpotType) {
		
		if(parkingSpotType.equals("TWOWHEELER")) {
			return new TwoWheelerParkingSpot();
		}
		else if(parkingSpotType.equals("FOURWHEELER")) {
			return new FourWheelerParkingSpot();
		}
		else if(parkingSpotType.equals("TRUCK")) {
			return new TruckParkingSpot();
		}
		else {
			return new ParkingSpot();
		}
	}
}
