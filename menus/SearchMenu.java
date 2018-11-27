package menus;

import java.util.Scanner;

import utils.Utils;

public class SearchMenu {
	public SearchMenuEnum SearchMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== SearchMenu ===");
		for(SearchMenuEnum m : SearchMenuEnum.values()) {
			System.out.println("  " + m.getCode() + ". " + m.getMessage());
		}

		int n;
		SearchMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(SearchMenuEnum m : SearchMenuEnum.values()) {
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
