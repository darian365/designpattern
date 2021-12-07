package com.study.designpattern.abstractFactory;

public class RegularBankAccountFactory extends AbstractProductFactory {

	@Override
	AbstractBankAccountProduct createBankAccountProduct() {
		AbstractBankAccountProduct bankAccount = new CheckingAccount();
		return bankAccount;
	}

	@Override
	AbstractCreditcardProduct createCreditCardProduct() {
		AbstractCreditcardProduct creditcardProduct = new SecuredCreditCard();
		return creditcardProduct;
	}

}
