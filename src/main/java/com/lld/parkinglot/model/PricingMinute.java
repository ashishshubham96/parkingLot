package com.lld.parkinglot.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class PricingMinute extends Pricing {
	
	public static final double rate = 1.0;

	@Override
	public Double calculatePrice(Ticket ticket) {

		LocalDateTime entryTime = ticket.getEntryTime();
		Duration duration = Duration.between(entryTime, LocalDateTime.now());
		long minute = duration.toMinutes();
		return (double)minute  * rate;
	}

}
