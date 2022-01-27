import java.util.Scanner;

public class MainApplication {
	
	private static void welcomeMsg() {
		
		System.out.println("\t\t\t\t\t\t\tApplication : LockedMe\n"+"\t\t\t\t\t\t\tdeveloper : Mahendra\n");
		System.out.println("Enter your choice which you want to select: \n\t1. Show existing files \n\t2. Perform reqired operations \n\t3. Exit from the application \n");
	}
	private static void selectMenu() {
		OptionOPerations operation=new OptionOPerations();
		Scanner sc =new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) {
		case 1:
			operation.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Enter your choice for CRUD level operation");
			System.out.println("\t1. Add a file ");
			System.out.println("\t2. Delete a file ");
			System.out.println("\t3. Search a file ");
			System.out.println("\t4. Exit CRUDS menu");

			ch=sc.nextInt();
			switch(ch) {
			case 1:
				operation.addFile();
				break;
			case 2:
				operation.deleteFile();
				break;
			case 3:
				operation.searchFile();
				break;
			case 4:
				System.out.println("Exited from the CRUDS operation...");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application...");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
		}selectMenu();
	}
	public static void main(String[] args) {
		welcomeMsg();
		selectMenu();
	}
}
