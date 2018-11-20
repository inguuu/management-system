package employee;

class FullTimeEmp extends Employee{
	private PositionEnum position; int grade;
	
	public FullTimeEmp(){
	}
	
	public FullTimeEmp(int id, String name, DepartmentEnum department, PositionEnum position, int grade) {
    super(id,name,department);
    this.position=position;
    this.grade=grade;
	}

	public void print() {
		
		System.out.print(super.toString());
		System.out.println(">> position: " + position.getMessage());
		System.out.println(">> grade: " + grade);
		
	}
}
