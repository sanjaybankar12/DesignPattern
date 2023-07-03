package com.pattern.strategy;

public class NormalVehicleStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Normal Vehicle Strategy!!");
	}

}
