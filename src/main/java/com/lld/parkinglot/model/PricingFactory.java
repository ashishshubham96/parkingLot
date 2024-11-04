package com.lld.parkinglot.model;

public class PricingFactory {

	public static Pricing getPricingObject(PricingStrategy pricingStrategy) {
		
		switch(pricingStrategy) {
		case HOURLY :
			
			return new PricingHourly();
			
		case MINUTES :
			
			return new PricingMinute();
			
		default :
			
			return new PricingMinute();
		
		}
	}
}
