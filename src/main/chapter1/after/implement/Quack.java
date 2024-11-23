package main.chapter1.after.implement;

import main.chapter1.after.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
