package employee;

import java.util.Scanner;

import utils.Utils;

public class EmployeeSet {
	final int MAX_SIZE = 100;	// �迭 ����
	Employee [] Emp;
	int indexEmp;// ��� ������
	
	public EmployeeSet() {
		Emp = new Employee[MAX_SIZE];
		indexEmp=0;
		
	}
	
	public void RegisterFullTimeEmp(Scanner s) {
		System.out.println(">>> ������ ��� <<< (id:101~500)");
		
		int id = Utils.getID(s);
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		PositionEnum position = Utils.getPosition(s);
		int grade = Utils.getGrade(s);

		Emp[indexEmp] = new FullTimeEmp(id, name, department, position, grade);
		indexEmp++;
	}

	public void RegisterPartTimeEmp(Scanner s) {
		System.out.println(">>> �ӽ��� ��� <<<(id: 501~)");
		
		int id = Utils.getID(s);
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		int hours = Utils.getHours(s);

		Emp[indexEmp] = new PartTimeEmp(id, name, department, hours);
		indexEmp++;
	}
	
	public void SearchAll() {
	
		for(int n=0; n<indexEmp; n++) {
			System.out.println("======================");
			Emp[n].print();
		
		}
	}
		
    public void SearchFullTime(){
    	
	for(int n=0; n<indexEmp; n++) {
		if(Emp[n] instanceof FullTimeEmp)
		{
		System.out.println("======================");
		Emp[n].print();
		}
	 }	
	}
	 public void SearchPartTime(){
	 for(int n=0; n<indexEmp; n++) {
		if(Emp[n] instanceof PartTimeEmp)
	    {
		System.out.println("======================");
		Emp[n].print();
		}
	   }
      }
	 public int SearchName(Scanner s){
		 String sname=null;//�Է¹��� �̸�
		 int val=0;//�Ǻ� ����
		 System.out.println("�˻��� �̸��� �Է��ϼ���");
	     System.out.print("name>>>");
	     sname=s.next();
		 for(int n=0; n<indexEmp; n++) {
			     
				if(Emp[n].name.equals(sname))
			    {
				   Emp[n].print();
				   val++;
				}		
			}	 
		    if(val==0)// ã������ ���ٸ� val==0
		    {
			   System.out.println("!!! �ش� �̸��� ������ �����ϴ�.");
			   
			}
		    return val;
	 }
	 
	 public void Update(Scanner s){
		 int n=0;
		 int pn;//��ġ�Լ� �Ǻ�
		 int id;
		
		 System.out.println("������ ������ id Ȯ���� ���� ���� �̸��� �˻��մϴ�.");
	     pn=SearchName(s);
		      if(pn!=-1)
		      {
		    	  System.out.println("������ id�� �Է��Ͻÿ�");
		    	  id=s.nextInt();
		    	  if(id>100&&id<=500)//id�� ������ �ϰ��
		    	  {
		    		 String name = Utils.getName(s);
		    		 DepartmentEnum department = Utils.getDepartment(s);
		  	  	  	 PositionEnum position = Utils.getPosition(s);
		  	  	     int grade = Utils.getGrade(s);
                
		  		     Emp[n] = new FullTimeEmp(id, name, department, position, grade);
		    	  }
		    	  else if(id>500)//id�� �ӽ����� ���
		    	  {
		    		  String name = Utils.getName(s);
				  	  DepartmentEnum department = Utils.getDepartment(s);
				  	  int hours = Utils.getHours(s);
				  	  Emp[n] = new PartTimeEmp(id, name, department, hours);
		    	  }
		      }
		    	  
		    	System.out.println("=== ���� ��� ===");
		    	System.out.println("==============");
                Emp[n].print();
		  	
	 }

}
	
	//���ϴ� �迭 ��Ҹ� ã�� ���� �޼ҵ� Ȱ��(�ε��� ã��)
	 