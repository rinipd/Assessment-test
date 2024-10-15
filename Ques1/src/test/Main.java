package test;

class Employee{
	
	String name = "Parinita";
	int id = 222076;
	float sal = 25000;
	String address = "Mira Road";
	
	public void display_info() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(address);
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

}

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display_info();
		System.out.println(emp);
	}
	
	
}
