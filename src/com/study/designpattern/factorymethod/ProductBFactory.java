package com.study.designpattern.factorymethod;

public class ProductBFactory extends AbstractProductFactory {

	@Override
	AbstractProduct createProduct() {
		AbstractProduct product = new ProductB();
		return product;
	}

}
