package com.design.pattern.pattern02.observer.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
