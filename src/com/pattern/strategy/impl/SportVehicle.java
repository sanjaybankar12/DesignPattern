package com.pattern.strategy.impl;

import com.pattern.strategy.DriveStrategy;

public class SportVehicle extends Vehicle {

	public SportVehicle(DriveStrategy driveStrategy) {
		super(driveStrategy);
	}

}
