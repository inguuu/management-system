package employee;

abstract class Employee {

	protected int id; String name; DepartmentEnum department; 
	
	public Employee(){
	}
	
	public Employee(int id, String name, DepartmentEnum department)
	{
		this.id=id;
		this.name=name;
		this.department=department;
	}
	public int getid()
	{
		return this.id;
	}
	public String getname()
	{
		return this.name;
	}
	public DepartmentEnum getdepartment()
	{
		return this.department;
	}
	
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setdepartment(DepartmentEnum department)
	{
		this.department=department;
	}
	
	public String toString( )
	{
		
		System.out.println(">> id: " + id);
		System.out.println(">> name: " + name);
		System.out.println(">> department: " + department.getMessage());
		return "";
		
	}
	abstract public void print();
	
}
