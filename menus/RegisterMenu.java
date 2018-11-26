package menus;

import java.util.Scanner;

import utils.Utils;

public class RegisterMenu {
	public RegisterMenuEnum RegisterMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== RegisterMenu ===");
		for(RegisterMenuEnum m :RegisterMenuEnum.values()) {
			System.out.println("  " + m.getCode() + ". " + m.getMessage());
		}

		int n;
		RegisterMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(RegisterMenuEnum m : RegisterMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
		}
		
		return select;
	}
	
}
