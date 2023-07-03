package com.pattern.strategy;

public class SportVehicleStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Sport Vehicle Strategy!!");
	}

}
