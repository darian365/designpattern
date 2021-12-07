package com.study.designpattern.abstractFactory;

public class Client {

	public static void main(String[] args) {
		AbstractProductFactory productFactory = new RegularBankAccountFactory();
		AbstractBankAccountProduct bankAccountProduct = productFactory.createBankAccountProduct();
		AbstractCreditcardProduct creditcardProduct = productFactory.createCreditCardProduct();
		bankAccountProduct.printBankAccount();
		creditcardProduct.printCreditcard();
		
		productFactory = new PremierBankAccountFactory();
		bankAccountProduct = productFactory.createBankAccountProduct();
		creditcardProduct = productFactory.createCreditCardProduct();
		bankAccountProduct.printBankAccount();
		creditcardProduct.printCreditcard();
	}
}
