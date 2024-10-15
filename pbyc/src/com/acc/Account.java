package com.acc;

import com.policyImp.*;

public class Account extends Company {

	@Override
	public double sal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}

	@Override
	public double sal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal + bonus;
	}

	@Override
	public double sal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal + bonus - tax;
	}
}