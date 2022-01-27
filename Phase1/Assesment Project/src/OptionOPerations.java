import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class OptionOPerations implements Files{
	List<String> storedFiles= new ArrayList<String>();
	File[] files = new File("C:\\Users\\srava\\eclipse-workspace\\phase1project").listFiles();
	private Scanner scan;
	private Scanner scan2;
	private Scanner scan3;
	private Scanner sc1;
	@Override
	public void showAllFiles() {
		// TODO Auto-generated method stub
		for(File filesIn : files) {
			if(filesIn.isFile()) {
				 storedFiles.add(filesIn.getName());
				//System.out.println(file.getName());
			}
		}
		for(int i=0;i<storedFiles.size();i++) {
			System.out.println(storedFiles.get(i));
		}

	}

	@Override
	public void addFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file which you want to add:");
		scan = new Scanner(System.in);
		String fileName=scan.nextLine();
		File F= new File(fileName);
		try {
			if(F.createNewFile()) {
				System.out.println(fileName+" file is added ");
				Desktop.getDesktop().edit(F);
			}
			else {
				System.out.println("file is there already");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

	@Override
	public void deleteFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file that you want to delete:");
		scan2 = new Scanner(System.in);
		String fileName=scan2.nextLine();
		File F= new File(fileName);
		if(F.delete())
			System.out.println(fileName+" is Deleted");
		else
			System.out.println("File Not Found");
	}

	@Override
	public void searchFile() {
		// TODO Auto-generated method stub  
		try {	
			scan3 = new Scanner(System.in);
			File directory = new File("C:\\Users\\srava\\eclipse-workspace\\phase1project");
			System.out.println("Enter the file name that you want to search:");
			String fileName=scan3.nextLine();
            File[] files=directory.listFiles();
            int flag=0;
            for (File file : files) {
                String name = file.getName();
                if (name.equals(fileName)) {
                       // System.out.println("The filename "+fileName+" is present in the directory");
        				File f= new File(fileName);
        				sc1 = new Scanner(f);
        				while(sc1.hasNextLine()) {
        				System.out.println(sc1.nextLine());
        				}
        			flag=1;	
                }
			}
        if(flag==0) {
        	System.out.println("File not found");
        }

		}catch(FileNotFoundException ex) {
			System.out.println("file not found");
		}

	}

}

