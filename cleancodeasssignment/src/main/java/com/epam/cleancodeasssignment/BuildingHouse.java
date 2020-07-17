package com.epam.cleancodeasssignment;

public class BuildingHouse {
	public double buildingCost(double areaOfHouse, String buildingType) {
		double totalCost = 0.0;
		if(buildingType.equalsIgnoreCase("Standard Materials")) 
			totalCost = 1200 * areaOfHouse;
		else if(buildingType.equalsIgnoreCase("Above Standard Materials")) 
			totalCost = 1500 * areaOfHouse;
		else if(buildingType.equalsIgnoreCase("High Standard Materials")) 
			totalCost = 1800 * areaOfHouse;
		else if(buildingType.equalsIgnoreCase("High Standard Materials and Fully automated Home")) 
			totalCost = 2500 * areaOfHouse;
		return totalCost;
	}



}
