package prob04;

public class Depart extends Employee {
	
	private String department;
	
	public Depart(String name, int s, String dept) {
		
		super(name, s);
		department = dept;
		
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		String name = this.getName();
		int salary = this.getSalary();
		
		System.out.println( "이름:" + name + "   연봉:" + salary + "   부서:" + department ); 
	}
	
	

}
