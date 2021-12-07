package com.study.designpattern.abstractFactory;

public class SecuredCreditCard extends AbstractCreditcardProduct {

	@Override
	void printCreditcard() {
		System.out.println("Secured Creditcard");
	}
}
