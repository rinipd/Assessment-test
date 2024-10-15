package com.policy;

public interface Policy {

	double sal(double sal);
	
	double sal(double sal, double bonus);
	
	double sal(double sal, double bonus, double tax);
	
}