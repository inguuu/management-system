package employee;

public enum DepartmentEnum {
	GENERAL_AFFAIR(1, "총무"),
	PERSONNEL(2, "인사"),
	PLANNING(3, "기획"),
	PRODUCTION(4, "생산"),
	SALES(5, "영업");

	int code;
	String message;
	
	DepartmentEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}
