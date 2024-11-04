package com.lld.parkinglot.model;

import java.time.LocalDateTime;

public class Ticket {
	
	private Vehicle vehicle;
	
	private LocalDateTime entryTime;
	
	private PricingStrategy pricingStrategy;

	public PricingStrategy getPricingStrategy() {
		return pricingStrategy;
	}

	public void setPricingStrategy(PricingStrategy pricingStrategy) {
		this.pricingStrategy = pricingStrategy;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}
	
	
}
