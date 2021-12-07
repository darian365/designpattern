package com.study.designpattern.abstractFactory;

public class PremierCheckingAccount extends AbstractBankAccountProduct {

	@Override
	void printBankAccount() {
		System.out.println("Premier Checking Account");
	}
}
