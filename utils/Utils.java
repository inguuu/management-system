package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import employee.DepartmentEnum;
import employee.PositionEnum;

public class Utils {
	static public int checkInputInteger(Scanner s, String msg) {
		int n=0;
		while(true) {
			boolean valid = true; // 유효한 값 입력 확인
			System.out.print(msg);

			try {
				n = s.nextInt(); // 정수 입력
			}
			catch(InputMismatchException e) { // 정수 입력 확인
				System.out.println("정수 입력하세요.");
				s.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				valid = false;
			}
			finally {
				if(valid) { // 정수 입력이면 루프 종료
					break;
				}
			}
		}
		
		return n;
	}
	
	public static int getID(Scanner s) {
		int id = Utils.checkInputInteger(s, ">> id: ");

		return id;
	}
	
	public static String getName(Scanner s) {
		String name=null;

        System.out.println(">>name");
        name=s.next();

		return name;
	}

	public static DepartmentEnum getDepartment(Scanner s) {
		int dept;
		DepartmentEnum department = null;
		while(true) {
			System.out.print("== 부서 목록: ");
			for(DepartmentEnum d : DepartmentEnum.values()) {
				System.out.print(d.getMessage() + "(" + d.getCode() + ") ");
			}
			System.out.println("");
			dept = Utils.checkInputInteger(s, ">> department: ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(DepartmentEnum d : DepartmentEnum.values()) {
				if(dept == d.getCode()) {
					valid = true;
					department = d;
					break;
				}
			}

			if(valid) {
				break;
			}
		}
		
		return department;
	}
	
	public static PositionEnum getPosition(Scanner s) {
		int pos;
		PositionEnum position = null;

		while(true) {
			System.out.print("== 직위 목록: ");
			for(PositionEnum d : PositionEnum.values()) {
				System.out.print(d.getMessage() + "(" + d.getCode() + ") ");
			}
			System.out.println("");
			pos = Utils.checkInputInteger(s, ">> position: ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(PositionEnum d : PositionEnum.values()) {
				if(pos == d.getCode()) {
					valid = true;
					position = d;
					break;
				}
			}

			if(valid) {
				break;
			}
		}
		return position;
	}
	
	public static int getGrade(Scanner s) {
		int grade = -1;
		System.out.println(">>grade:");
		grade=s.nextInt();

		return grade;
	}

	public static int getHours(Scanner s) {
		int hours = -1;
		System.out.println(">>hours:");
	    hours=s.nextInt();

		return hours;
	}
}
