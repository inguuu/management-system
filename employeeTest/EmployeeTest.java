package employeeTest;
import java.util.Scanner;

import employee.EmployeeSet;
import menus.Menu;
import menus.MainMenuEnum;
import menus.SearchMenuEnum;
import menus.RegisterMenuEnum;
import menus.SearchMenu;
import menus.RegisterMenu;
import menus.UpdateMenuEnum;
import menus.UpdateMenu;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeSet set = new EmployeeSet();
		Menu menu = new Menu();
        SearchMenu smenu = new SearchMenu();
        RegisterMenu rmenu = new RegisterMenu();
        UpdateMenu umenu = new UpdateMenu();
        

		Scanner scanner = new Scanner(System.in);


		while(true) {
			MainMenuEnum mm = menu.MainMenu(scanner);
			if(mm == MainMenuEnum.REGISTER) {
				
				while(true)
				{
				RegisterMenuEnum rm = rmenu.RegisterMenu(scanner);
				if(rm==RegisterMenuEnum.REGULAR)
				{
					
				
					set.RegisterFullTimeEmp(scanner);
					
				}
				else if(rm == RegisterMenuEnum.TEMPORARY) 
				{
					
					set.RegisterPartTimeEmp(scanner);
				}
				else if(rm == RegisterMenuEnum.RETURN)
				{
					break;
				}
				}
				
				
			}
			else if(mm == MainMenuEnum.SEARCH) {
				
				while(true)
				{
				SearchMenuEnum sm = smenu.SearchMenu(scanner);
				if(sm==SearchMenuEnum.ALLSEARCH)
				{
					
					
					set.SearchAll();
				}
				else if(sm==SearchMenuEnum.FULLSEARCH)
				{
					set.SearchFullTime();
				}
				else if(sm==SearchMenuEnum.PARTSEARCH)
				{
					set.SearchPartTime();
				}
				else if(sm==SearchMenuEnum.NAMESEARCH)
				{
					set.SearchName(scanner);
				}
				else if(sm == SearchMenuEnum.RETURN)
				{
					break;
				}
				}
			}
			else if(mm == MainMenuEnum.UPDATE) {
				
				
				while(true)
				{
				UpdateMenuEnum um = umenu.UpdateMenu(scanner);
				if(um==UpdateMenuEnum.UPDATE)
				{
					
					set.Update(scanner);
				}
				
				else if(um == UpdateMenuEnum.RETURN)
				{
					break;
				}
				}
			}
			else if(mm == MainMenuEnum.EXIT) {
				System.out.print("Good BYE!");
				scanner.close();
				break;
			}
		}
		

		scanner.close();
	}
}
