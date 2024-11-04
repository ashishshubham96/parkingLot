package com.lld.parkinglot.model;

public class PaymentDebitCard extends Payment {

	@Override
	public PaymentStatus collectPayement(PaymentType paymentType, Double amount) {
		
		
		
		return PaymentStatus.SUCCESS;
		
	}

}
