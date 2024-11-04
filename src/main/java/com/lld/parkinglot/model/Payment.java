package com.lld.parkinglot.model;

public abstract class Payment {

	private PaymentType paymentType;
	
	private PaymentStatus paymentStatus;

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public abstract PaymentStatus collectPayement(PaymentType paymentType, Double amount);
}
