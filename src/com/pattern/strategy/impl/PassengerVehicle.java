package com.pattern.strategy.impl;

import com.pattern.strategy.DriveStrategy;

public class PassengerVehicle extends Vehicle {

	public PassengerVehicle(DriveStrategy driveStrategy) {
		super(driveStrategy);
	}

}
