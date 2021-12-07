package com.study.designpattern.simplefactory;

public class SimpleProductFactory {

	static AbstractProduct createProduct(String type) {
		
		AbstractProduct product = null;
		
		if(type.equals("A")) {
			product = new ProductA();
		}else if(type.equals("B")) {
			product = new ProductB();
		}
		return product;
	}
}
