package com.pattern.strategy.impl;

import com.pattern.strategy.DriveStrategy;
import com.pattern.strategy.NormalVehicleStrategy;
import com.pattern.strategy.SportVehicleStrategy;

public class Vehicle {

	private DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		this.driveStrategy.drive();
	}
	
	public static void main(String[] args) {
		Vehicle veh = new SportVehicle(new NormalVehicleStrategy());
		veh.drive();
	}
}
