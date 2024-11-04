package com.lld.parkinglot.service;

import com.lld.parkinglot.model.Payment;
import com.lld.parkinglot.model.PaymentFactory;
import com.lld.parkinglot.model.PaymentStatus;
import com.lld.parkinglot.model.PaymentType;
import com.lld.parkinglot.model.Pricing;
import com.lld.parkinglot.model.PricingFactory;
import com.lld.parkinglot.model.Ticket;

import Exception.PaymentMethodNotFoundException;

public class Exit {

	private Integer gateNumber;

	public Integer getGateNumber() {
		return gateNumber;
	}

	public void setGateNumber(Integer gateNumber) {
		this.gateNumber = gateNumber;
	}
	
	public boolean openGate(Ticket ticket, PaymentType paymentType) {
		
		Payment payment;
		PaymentStatus paymentStatus = PaymentStatus.PROCESSING;
		Pricing pricing = PricingFactory.getPricingObject(ticket.getPricingStrategy());
		Double amount = pricing.calculatePrice(ticket);
		
		try {
			payment = PaymentFactory.getPaymentObject(paymentType);
			paymentStatus = payment.collectPayement(paymentType, amount);
		} catch (PaymentMethodNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return paymentStatus.equals(PaymentStatus.SUCCESS) ? true : false;
	}
}
