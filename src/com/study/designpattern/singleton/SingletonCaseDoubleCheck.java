package com.study.designpattern.singleton;

public class SingletonCaseDoubleCheck {

	public static void main(String[] args) {
		SingletonDoubleCheck obj1 = SingletonDoubleCheck.getInstance();
		SingletonDoubleCheck obj2 = SingletonDoubleCheck.getInstance();
		
		System.out.println(obj1 == obj2);

	}

}

class SingletonDoubleCheck {
	
	private static SingletonDoubleCheck INSTANCE = null;
	
	private SingletonDoubleCheck() {
	}
	
	public static SingletonDoubleCheck getInstance() {
		if(INSTANCE == null) {
			synchronized(SingletonDoubleCheck.class) {
				if(INSTANCE == null) {
					INSTANCE = new SingletonDoubleCheck();
				}
			}
		}
		return INSTANCE;
	}
}