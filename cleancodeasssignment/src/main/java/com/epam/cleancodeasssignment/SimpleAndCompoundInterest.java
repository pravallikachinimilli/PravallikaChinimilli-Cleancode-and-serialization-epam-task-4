package com.epam.cleancodeasssignment;

public class SimpleAndCompoundInterest {
	public double calculateSimpleInterest(double principle, double rateOfInterest, double time) {
		return (principle * time * rateOfInterest)/100;
	}

	public double calculateCompoundInterest(double principle, double rateOfInterest, double time) {
		
		return (principle * Math.pow(1.0+rateOfInterest/100.0,time) - principle);
	}

}
