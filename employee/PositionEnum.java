package employee;

public enum PositionEnum {
	DIRECTER(1, "이사"),
	GENERAL_MANAGER(2, "부장"),
    MANGER(3, "과장"),
	ASSISTANT_MANAGER(4, "대리"),
	STAFF(5, "사원");

	int code;
	String message;
	
	PositionEnum(int code, String message) {
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
