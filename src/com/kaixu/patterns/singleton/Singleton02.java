package com.kaixu.patterns.singleton;

public class Singleton02 {
	
	private Singleton02(){}
	
	/*private static Singleton02 singleton;
	
	public static synchronized Singleton02 getInstance(){
		if(singleton == null){
			singleton = new Singleton02();
		}
		return singleton;
	}*/
	
	private volatile static Singleton02 singleton;
	
	public static  Singleton02 getInstance(){
		if(singleton == null){
			synchronized (Singleton02.class) {
				if(singleton == null){
					singleton = new Singleton02();
				}
				
			}
		}
		return singleton;
	}

}
