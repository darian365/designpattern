package com.study.designpattern.abstractFactory;

public class PremierBankAccountFactory extends AbstractProductFactory {

	@Override
	AbstractBankAccountProduct createBankAccountProduct() {
		AbstractBankAccountProduct bankAccount = new PremierCheckingAccount();
		return bankAccount;
	}

	@Override
	AbstractCreditcardProduct createCreditCardProduct() {
		AbstractCreditcardProduct creditcardProduct = new CashRewardCreditCard();
		return creditcardProduct;
	}

}
