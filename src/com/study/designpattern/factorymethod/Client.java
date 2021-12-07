package com.study.designpattern.factorymethod;

public class Client {

	public static void main(String[] args) {
		AbstractProductFactory productFactory = new ProductAFactory();
		AbstractProduct product = productFactory.createProduct();
		product.printProduct();
		
		productFactory = new ProductBFactory();
		product = productFactory.createProduct();
		product.printProduct();
	}
}
