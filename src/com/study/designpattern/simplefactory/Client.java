package com.study.designpattern.simplefactory;

public class Client {

	public static void main(String[] args) {
		AbstractProduct product = SimpleProductFactory.createProduct("A");
		product.printProduct();
		
		product = SimpleProductFactory.createProduct("B");
		product.printProduct();
	}
}
