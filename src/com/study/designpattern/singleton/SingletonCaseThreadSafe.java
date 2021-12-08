package com.study.designpattern.singleton;

public class SingletonCaseThreadSafe {

	public static void main(String[] args) {
		SingletonThreadSafe obj1 = SingletonThreadSafe.getInstance();
		SingletonThreadSafe obj2 = SingletonThreadSafe.getInstance();
		
		System.out.println(obj1 == obj2);

	}

}

class SingletonThreadSafe {
	
	private static volatile SingletonThreadSafe INSTANCE = null;
	
	private SingletonThreadSafe() {
	}
	
	public static synchronized SingletonThreadSafe getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SingletonThreadSafe();
		}
		return INSTANCE;
	}
}