package main.chapter1.after.implement;

import main.chapter1.after.behavior.FlyBehavior;

/**
 * Fly 라는 행동에 대한 구체 클래스
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I Can't Fly");
	}

}
