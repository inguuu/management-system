package menus;



public enum SearchMenuEnum {

	
	ALLSEARCH(21, "일괄 검색"),
	FULLSEARCH(22, "정규직 검색"),
	PARTSEARCH(23, "임시직 검색"),
	NAMESEARCH(24, "이름 검색"),
	RETURN(29, "돌아가기");
	
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

