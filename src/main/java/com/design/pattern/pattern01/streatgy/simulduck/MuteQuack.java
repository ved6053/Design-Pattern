package com.design.pattern.pattern01.streatgy.simulduck;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
