package abstinterface;

interface Policy{
	double sal(double sal);
	double sal(double sal, double bonus);
	double sal(double sal, double bonus, double tax);
}

abstract class Account implements Policy{
	@Override
	public double sal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}
	@Override
	public double sal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal+bonus;
	}
	@Override
	public double sal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal+bonus-tax;
	}
}

class Manager extends Account{
	@Override
	public double sal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return super.sal(sal, bonus);
	}
}

public class Main{
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println(manager.sal(25000, 5000));
		
	}
}