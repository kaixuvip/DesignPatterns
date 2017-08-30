package com.kaixu.patterns.singleton;

/**
 * <h1>懒汉式，线程不安全</h1>
 * <b>是否 Lazy 初始化：</b>是
 * <b>是否多线程安全：</b>否
 * <b>实现难度：</b>易
 * <b>描述：</b>这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * @author kaixu
 *
 */
public class Singleton01 {
	
	private Singleton01(){}
	
	private static Singleton01 singleton;
	
	public static Singleton01 getInstance(){
		if(singleton == null){
			singleton = new Singleton01();
		}
		return singleton;
	}

}
