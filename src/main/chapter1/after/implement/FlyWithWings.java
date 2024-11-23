package main.chapter1.after.implement;

import main.chapter1.after.behavior.FlyBehavior;

/**
 * Fly 라는 행동을 구현한 구체 클래스
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Fly With My Wings");
	}

}
