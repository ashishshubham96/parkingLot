package com.lld.parkinglot.service;

import Exception.ParkingStrategyNotFound;

public class ParkingStrategyFactory {

	public static Parking getParkingObject(ParkingStrategy parkingStrategy) throws ParkingStrategyNotFound {
		
		switch(parkingStrategy) {
			case NEAREST_TO_ENTRY :
				return new NearestToEntry();
				
			case NEAREST_TO_EXIT :
				return new NearestToExit();
				
			case NEAREST_TO_LIFT :
				return new NearestToLift();
				
			default:
				throw new ParkingStrategyNotFound();
				
		}
	}
}
