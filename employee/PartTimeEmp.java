package employee;

class PartTimeEmp extends Employee{
           private int hours;
	
	public PartTimeEmp(){
	}
	
	public PartTimeEmp (int id, String name, DepartmentEnum department, int hours) {
		super(id,name,department);
	    this.hours=hours;
	}
	
	public void print() {
		System.out.print(super.toString());
		System.out.println(">> hours: " + hours);
		  
	}
}
