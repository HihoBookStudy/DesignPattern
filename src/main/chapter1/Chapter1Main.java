package main.chapter1;

import main.chapter1.after.ImprovedDuck;
import main.chapter1.after.MallardDuck;
import main.chapter1.after.implement.FlyWithRocket;
import main.chapter1.after.implement.FlyWithWings;
import main.chapter1.after.implement.MuteQuack;
import main.chapter1.after.implement.Quack;

public class Chapter1Main {
	public static void main(String[] args) {
		ImprovedDuck duck = new MallardDuck(new FlyWithRocket(), new MuteQuack());

		duck.display();
		duck.performFly();
		duck.performQuack();

		duck.changeFlyBehavior(new FlyWithWings());
		duck.changeQuackBehavior(new Quack());

		System.out.println("========change duck behavior========");
		duck.performFly();
		duck.performQuack();
	}
}
