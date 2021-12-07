package com.study.designpattern.factorymethod;

public class ProductAFactory extends AbstractProductFactory{

	@Override
	AbstractProduct createProduct() {
		AbstractProduct product = new ProductA();
		return product;
	}

}
