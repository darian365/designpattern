package com.study.designpattern.singleton;

public class SingletonCaseHunger {
	public static void main(String[] args) {
		Singleton1 obj1 = Singleton1.getInstance();
		Singleton1 obj2 = Singleton1.getInstance();
		
		System.out.println(obj1 == obj2);
	}
}

class Singleton1 {
	
	private final static Singleton1 INSTANCE = new Singleton1();
	
	private Singleton1() {
	}
	
	public static Singleton1 getInstance() {
		return INSTANCE;
	}
}
