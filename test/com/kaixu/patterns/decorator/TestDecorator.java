package com.kaixu.patterns.decorator;
import org.junit.Test;

import com.kaixu.patterns.decorator.Shap;
import com.kaixu.patterns.decorator.imp.Circle;
import com.kaixu.patterns.decorator.imp.RedDecorator;

public class TestDecorator {

	@Test
	public void test() {
		Shap circle = new Circle();
		Shap redCircle = new RedDecorator(circle);
		redCircle.Draw();
	}

}
