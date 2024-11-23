package main.chapter1.after.implement;

import main.chapter1.after.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Fly With My Wings");
	}

}
