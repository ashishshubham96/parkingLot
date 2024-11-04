package com.lld.parkinglot.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class PricingHourly extends Pricing {
	
	public static final double rate = 50.0;

	@Override
	public Double calculatePrice(Ticket ticket) {

		LocalDateTime entryTime = ticket.getEntryTime();
		Duration duration = Duration.between(entryTime, LocalDateTime.now());
		long hours = duration.toHoursPart();
		long minute = duration.toMinutesPart();
		if(minute > 0) {
			hours += 1;
		}
		return (double)hours * rate;
	}

}
