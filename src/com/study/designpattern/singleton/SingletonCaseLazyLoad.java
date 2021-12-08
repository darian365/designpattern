package com.study.designpattern.singleton;

public class SingletonCaseLazyLoad {

	public static void main(String[] args) {
		Singleton2 obj1 = Singleton2.getInstance();
		Singleton2 obj2 = Singleton2.getInstance();
		
		System.out.println(obj1 == obj2);

	}

}

class Singleton2 {
	
	private static Singleton2 INSTANCE = null;
	
	private Singleton2() {
	}
	
	public static Singleton2 getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Singleton2();
		}
		return INSTANCE;
	}
}