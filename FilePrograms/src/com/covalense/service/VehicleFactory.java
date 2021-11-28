package com.covalense.service;
import com.covalense.beans.Bus;
import com.covalense.beans.Vehicle;

public class VehicleFactory {
	private VehicleFactory() {
		super();
		
	}
	public static Vehicle getVehicle() {
		Vehicle v=new Bus();
		
	}

}
