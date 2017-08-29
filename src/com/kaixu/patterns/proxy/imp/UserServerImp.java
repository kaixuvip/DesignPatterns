package com.kaixu.patterns.proxy.imp;

import com.kaixu.patterns.proxy.UserServer;

public class UserServerImp implements UserServer {

	@Override
	public String eatFood() {
		// TODO Auto-generated method stub
		System.out.println("吃饭中");
		return "吃饭中";
	}

}
