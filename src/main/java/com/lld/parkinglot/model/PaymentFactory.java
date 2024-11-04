package com.lld.parkinglot.model;

import Exception.PaymentMethodNotFoundException;

public class PaymentFactory {

	public static Payment getPaymentObject(PaymentType payementType) throws PaymentMethodNotFoundException {
		
		switch(payementType){
			case DEBIT_CARD :
				
				return new PaymentDebitCard();
				
			case CREDIT_CARD :
				
				return new PaymentCreditCard();
				
			case UPI :
				
				return new PaymentUpi();
				
			default :
				
				throw new PaymentMethodNotFoundException();
				
		}
		
	}
}
