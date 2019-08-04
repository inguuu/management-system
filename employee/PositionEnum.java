package employee;

public enum PositionEnum {
	DIRECTER(1, "�̻�"),
	GENERAL_MANAGER(2, "����"),
    MANGER(3, "����"),
	ASSISTANT_MANAGER(4, "�븮"),
	STAFF(5, "���");

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
