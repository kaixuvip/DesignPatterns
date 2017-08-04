package com.kaixu.patterns.decorator;

public abstract class Decorator implements Shap {
	
	private Shap shap;
	public Decorator(Shap shap){
		this.shap = shap;
	}
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		shap.Draw();
		
	}
	

}
