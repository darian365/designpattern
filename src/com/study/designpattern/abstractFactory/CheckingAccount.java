package com.study.designpattern.abstractFactory;

public class CheckingAccount extends AbstractBankAccountProduct {

	@Override
	void printBankAccount() {
		System.out.println("Checking Account");
	}
}
