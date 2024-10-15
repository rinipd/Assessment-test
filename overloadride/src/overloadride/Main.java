package overloadride;

class Employee{
	
	public int sal(int sal) {
		return sal;
	}	
	
	public int sal(int sal, int bonus) {
		return sal + bonus;
	}
}

class Manager extends Employee{
	
	@Override
	public int sal(int sal, int bonus) {
		// TODO Auto-generated method stub
		return super.sal(sal, bonus);
	}	
	
}

public class Main {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		Manager manager = new Manager();
		System.out.println("Employee1: "+ emp.sal(25000));;
		System.out.println("Employee2: "+ emp.sal(35000,2000));
		System.out.println("Manager: "+ manager.sal(50000, 5000));
		
	}
	
	
}