package com.lld.parkinglot.model;

import java.util.HashMap;
import java.util.Map;

import Exception.FloorNotFound;

public class ParkingSystem {

	private static  String name;
	
	private static Map<Integer, Floor> floors;
	
	private static ParkingSystem parkingSystem;
	
	public static ParkingSystem getParkingSystemInstance() {
		if(parkingSystem == null) {
			return new ParkingSystem();
		}
		else {
			return parkingSystem;
		}
	}
	
	

	public static String getName() {
		return name;
	}



	public static void setName(String name) {
		ParkingSystem.name = name;
	}



	public static Map<Integer, Floor> getFloors() {
		return floors;
	}



	public static void setFloors(Map<Integer, Floor> floors) {
		ParkingSystem.floors = floors;
	}



	public static void addFloor(int numberOfFloor) {
		for(int i=0;i<numberOfFloor;i++) {
			int floorId = floors.size() + 1;
			floors.put(floorId, new Floor());
		}
	}
	
	public static void removeFloor(int floorId) throws FloorNotFound {
		if(floors.containsKey(floorId)) {
			floors.remove(floorId);
		}
		else {
			throw new FloorNotFound();
		}
	}
	
}
