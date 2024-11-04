package com.lld.parkinglot.service;

import java.time.LocalDateTime;

import com.lld.parkinglot.model.ParkingSpot;
import com.lld.parkinglot.model.PricingStrategy;
import com.lld.parkinglot.model.Ticket;
import com.lld.parkinglot.model.Vehicle;

import Exception.NoParkingSpotFound;
import Exception.ParkingFullException;
import Exception.ParkingStrategyNotFound;

public class Entrance {

	private Integer gateNumber;
	

	public Integer getGateNumber() {
		return gateNumber;
	}

	public void setGateNumber(Integer gateNumber) {
		this.gateNumber = gateNumber;
	}
	
	
	
	public Ticket findParkingSpace(ParkingStrategy parkingStrategyType, Vehicle vehicle, PricingStrategy pricingStrategy) throws ParkingFullException {
		Parking parking;
		ParkingSpot parkingSpot = null;
		try {
			parking = ParkingStrategyFactory.getParkingObject(parkingStrategyType);
			parkingSpot = parking.findParkingSpot(vehicle.getVehicleType().toString());
			parkingSpot.setFree(false);
			parkingSpot.setVehicle(vehicle);
		} catch (ParkingStrategyNotFound | NoParkingSpotFound e) {
			// TODO Auto-generated catch block
			throw new ParkingFullException();
		}
		
		Ticket ticket = generateTicket(parkingSpot, vehicle, pricingStrategy);
		
		
		return ticket;
	}

	private Ticket generateTicket(ParkingSpot parkingSpot, Vehicle vehicle, PricingStrategy pricingStrategy) {
		Ticket ticket = new Ticket();
		ticket.setEntryTime(LocalDateTime.now());
		ticket.setVehicle(vehicle);
		ticket.setPricingStrategy(pricingStrategy);
		return ticket;
	}
	
	
}
