package com.design.pattern.pattern01.streatgy.simulduck;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
