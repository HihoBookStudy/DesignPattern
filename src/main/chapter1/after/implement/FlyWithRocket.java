package main.chapter1.after.implement;

import main.chapter1.after.behavior.FlyBehavior;

/**
 * Fly 라는 행동을 구현한 구체 클래스
 */
public class FlyWithRocket implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("fly with my rocket");
	}
}
