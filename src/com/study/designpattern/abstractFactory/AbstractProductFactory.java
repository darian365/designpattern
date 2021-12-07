package com.study.designpattern.abstractFactory;

abstract class AbstractProductFactory {

	abstract AbstractBankAccountProduct createBankAccountProduct();
	abstract AbstractCreditcardProduct createCreditCardProduct();
}
