package menus;

import java.util.Scanner;

import utils.Utils;

public class UpdateMenu {
	public UpdateMenuEnum UpdateMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== DeleteMenu ===");
		for(UpdateMenuEnum m : UpdateMenuEnum.values()) {
			System.out.println("  " + m.getCode() + ". " + m.getMessage());
		}

		int n;
		UpdateMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "����>>> ");
			
			// ��ȿ�� �� �Է� Ȯ��
			boolean valid = false;
			for(UpdateMenuEnum m : UpdateMenuEnum.values()) {
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
