package com.nt.service;

public class PaymentService {

	public static void cardPayment(Long cardNo, int amt) {
		System.out.println("Payment done by Card");
	}
	public static void upiPayment(Long pin, int amt) {
		System.out.println("Payment done by UPI");
	}
}
