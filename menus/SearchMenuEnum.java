package menus;



public enum SearchMenuEnum {

	
	ALLSEARCH(21, "�ϰ� �˻�"),
	FULLSEARCH(22, "������ �˻�"),
	PARTSEARCH(23, "�ӽ��� �˻�"),
	NAMESEARCH(24, "�̸� �˻�"),
	RETURN(29, "���ư���");
	
	int code;
	String message;
	
	SearchMenuEnum(int code, String message) {
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

