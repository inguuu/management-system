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
			n = Utils.checkInputInteger(s, "����>>> ");
			
			// ��ȿ�� �� �Է� Ȯ��
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
