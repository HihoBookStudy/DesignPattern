package main.chapter1.after;

import main.chapter1.after.behavior.FlyBehavior;
import main.chapter1.after.behavior.QuackBehavior;

/**
 * 전략 패턴 사용 예제 클래스
 */
public abstract class ImprovedDuck {

	// Composition 으로 행동 인터페이스 타입 변수를 가진다.
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public ImprovedDuck() {}

	public abstract void display();

	// ImprovedDuck 자신이 행동을 수행하는 것이 아닌 행동 인터페이스에게 행동을 위임(delegate)한다.
	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks can swim");
	}

	// 만약 런타임 도중 행동의 변경이 필요한 경우 setter 를 활용해 행동 인터페이스 구현체를 바꿀 수 있다.
	public void changeFlyBehavior(FlyBehavior flyBehavior) {
		if(flyBehavior == null) {
			return;
		}
		this.flyBehavior = flyBehavior;
	}

	public void changeQuackBehavior(QuackBehavior quackBehavior) {
		if(quackBehavior == null) {
			return;
		}
		this.quackBehavior = quackBehavior;
	}

}
