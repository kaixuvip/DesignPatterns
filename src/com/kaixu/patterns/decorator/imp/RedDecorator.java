package com.kaixu.patterns.decorator.imp;

import com.kaixu.patterns.decorator.Decorator;
import com.kaixu.patterns.decorator.Shap;

public class RedDecorator extends Decorator{

	public RedDecorator(Shap shap) {
		super(shap);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("property is red");
		super.Draw();
		
	}
	
	

}
