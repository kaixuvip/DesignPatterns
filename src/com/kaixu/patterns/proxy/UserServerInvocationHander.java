package com.kaixu.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServerInvocationHander implements InvocationHandler {
	
	private Object target;
	
	public UserServerInvocationHander() {
		// TODO Auto-generated constructor stub
		super();
	}

	UserServerInvocationHander(Object target){
		super();
		this.target = target;
	}
	
	@Override
	public Object invoke(Object arg0, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("吃饭之前要刷牙");
		Object result = method.invoke(target, args);
		System.out.println("吃饭之后要漱口");
		return result;
	}

}
