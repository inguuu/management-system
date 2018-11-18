package employee;

import java.util.Scanner;

import utils.Utils;

public class EmployeeSet {
	final int MAX_SIZE = 100;	// 배열 길이
	Employee [] Emp;
	int indexEmp;// 모든 직원수
	
	public EmployeeSet() {
		Emp = new Employee[MAX_SIZE];
		indexEmp=0;
		
	}
	
	public void RegisterFullTimeEmp(Scanner s) {
		System.out.println(">>> 정규직 등록 <<< (id:101~500)");
		
		int id = Utils.getID(s);
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		PositionEnum position = Utils.getPosition(s);
		int grade = Utils.getGrade(s);

		Emp[indexEmp] = new FullTimeEmp(id, name, department, position, grade);
		indexEmp++;
	}

	public void RegisterPartTimeEmp(Scanner s) {
		System.out.println(">>> 임시직 등록 <<<(id: 501~)");
		
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
		 String sname=null;//입력받을 이름
		 int val=0;//판별 숫자
		 System.out.println("검색할 이름을 입력하세요");
	     System.out.print("name>>>");
	     sname=s.next();
		 for(int n=0; n<indexEmp; n++) {
			     
				if(Emp[n].name.equals(sname))
			    {
				   Emp[n].print();
				   val++;
				}		
			}	 
		    if(val==0)// 찾은값이 없다면 val==0
		    {
			   System.out.println("!!! 해당 이름의 직원이 없습니다.");
			   
			}
		    return val;
	 }
	 
	 public void Update(Scanner s){
		 int n=0;
		 int pn;//서치함수 판별
		 int id;
		
		 System.out.println("갱신할 직원의 id 확인을 위해 직원 이름을 검색합니다.");
	     pn=SearchName(s);
		      if(pn!=-1)
		      {
		    	  System.out.println("갱신할 id를 입력하시오");
		    	  id=s.nextInt();
		    	  if(id>100&&id<=500)//id가 정규직 일경우
		    	  {
		    		 String name = Utils.getName(s);
		    		 DepartmentEnum department = Utils.getDepartment(s);
		  	  	  	 PositionEnum position = Utils.getPosition(s);
		  	  	     int grade = Utils.getGrade(s);
                
		  		     Emp[n] = new FullTimeEmp(id, name, department, position, grade);
		    	  }
		    	  else if(id>500)//id가 임시직일 경우
		    	  {
		    		  String name = Utils.getName(s);
				  	  DepartmentEnum department = Utils.getDepartment(s);
				  	  int hours = Utils.getHours(s);
				  	  Emp[n] = new PartTimeEmp(id, name, department, hours);
		    	  }
		      }
		    	  
		    	System.out.println("=== 갱신 결과 ===");
		    	System.out.println("==============");
                Emp[n].print();
		  	
	 }

}
	
	//원하는 배열 요소를 찾기 의한 메소드 활용(인덱스 찾기)
	 