


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EmpFileHandling {

	public static void main(String[] args) {
		 Scanner stringInput = new Scanner(System.in);
	        String optionSelect,continueSelect = "y";        
	        
	        while( continueSelect.equalsIgnoreCase("y") ) {        	
	        	   System.out.println("\t\t Following are optionds to Employee Records\n\n");
	        
		        System.out.println("1  Add  Record ");
		        System.out.println("2  View All  Record ");	
		        System.out.println("3  Delete a Record ");
		        System.out.println("4 Search a Record ");
		        System.out.println("5  Update a Record ");	        
		    
		        System.out.print("\n\n");
		        System.out.println("Enter your option: ");
		        optionSelect = stringInput.nextLine();
		        
		        if( optionSelect.equals("1") ) {
		        		try {
							addNewEmpRecord();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        } else if( optionSelect.equals("2") ) {
		        		try {
							displayAllRecord();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        } else if( optionSelect.equals("3") ) {
		        		try {
							DeleteARecordByEmpID();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        }	else if( optionSelect.equals("4") ) {
		        		try {
							SearchEmpRecordbyID();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        }	else if( optionSelect.equals("5") ) {
		        		try {
							updateRecordbyID();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        }	
			        	
		        System.out.println("Do you want to continue? Y/N");
		        continueSelect = stringInput.nextLine();
		       	
	        }

	}
	
	  public static void addNewEmpRecord() throws IOException {
  		
  		BufferedWriter buffWriter = new BufferedWriter( new FileWriter("records.txt",true) );
  		Scanner giveInput = new Scanner(System.in);
  		
  		String empID, empName, empAge, empAddress;
  		
  		System.out.print("Enter the Employee ID: ");
  		empID = giveInput.nextLine();
  		System.out.print("Enter the Employee Name: ");
  		empName = giveInput.nextLine();
  		System.out.print("Enter the Employee Age: ");
  		empAge = giveInput.nextLine();
  		System.out.print("Enter the Employee Address: ");
  		empAddress = giveInput.nextLine();    		
  		   		
  		buffWriter.write(empID+","+empName+","+empAge+","+empAddress);
  		buffWriter.flush();
  		buffWriter.newLine();
  		buffWriter.close();		
  		System.out.println("EMPLOYEE IS ADDED");
  	
  }
	  
	  
	 
	    
	
	public static void displayAllRecord() throws IOException {
	    	BufferedReader bbuffReader = new BufferedReader( new FileReader("records.txt") );
	    		
	    	String record;
	    		
	    
	    	System.out.println("	EMPLOYEE DETAILS  ");
	    	
	    	while( ( record = bbuffReader.readLine() ) != null ) {
	    			
	    		StringTokenizer strTokenVar = new StringTokenizer(record,",");
	    			
	    		System.out.println("	"+strTokenVar.nextToken()+"	"+strTokenVar.nextToken()+" 		"+strTokenVar.nextToken()+"			"+strTokenVar.nextToken()+"      |");
		
	    	}
	    		
	    	System.out.println("\n\n\n");
	    }

	
	
	public static void DeleteARecordByEmpID() throws IOException {
	    		Scanner strInput =  new Scanner(System.in);
	    		String EMPID, Emprecord;
	    		
	    		
	    		File tempDB = new File("records_temp.txt");
	    		File db = new File("records.txt");
	    		
	    		
	    		BufferedReader bufferRead = new BufferedReader( new FileReader( db ) );
	    		BufferedWriter buffWriter = new BufferedWriter( new FileWriter( tempDB ) );
	    		
	    		
	    		System.out.println("\t\t Delete Employee Record\n");
	    		
	    		System.out.println("Enter the Employee ID: ");
	    		EMPID =  strInput.nextLine();
	    		
	    		
	    		while( ( Emprecord = bufferRead.readLine() ) != null ) {
	    			
	    			
	    			if( Emprecord.contains(EMPID) ) 
	    				continue;
	   
	    			buffWriter.write(Emprecord);
	    			buffWriter.flush();
	    			buffWriter.newLine();
	 
	    		}
	    		
	    		bufferRead.close();
	    		buffWriter.close();
	    		
	    		db.delete();
	    		
	    		tempDB.renameTo(db);

	    }
	

	public static void SearchEmpRecordbyID() throws IOException {
	    		String ID,record;
	    		Scanner strInput = new Scanner(System.in);
	    		
	    		BufferedReader br = new BufferedReader( new FileReader("records.txt") );
	    		
	    		System.out.println("\t\t Search Employee Record\n");
	    	
	    		
	    		System.out.println("Enter the Employee ID: ");
	    		ID = strInput.nextLine();
	    		
	    	
	    		System.out.println(" 	EMPLOYEE DETAILS		   ");
	    		
	    		while( ( record = br.readLine() ) != null ) {
	    			
	    			StringTokenizer st = new StringTokenizer(record,",");
	    			if( record.contains(ID) ) {
	    				System.out.println("	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
	    			}
	    			
	    			
	    			
	    		}
	    		
	    		System.out.println();
	    		br.close();
	    		
	    		
	    		
	    }
	
	
	public static void updateRecordbyID() throws IOException {
	    		String newName, newAge, newAddr, record, ID,record2;
	    		
	    		File db = new File("records.txt");
	    		File tempDB = new File("records_temp.txt");
	    		
	    		BufferedReader br = new BufferedReader( new FileReader(db) );
	    		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
	    		    		
	    		Scanner strInput = new Scanner(System.in);
	    		
	    		System.out.println("\t\t Update Employee Record\n\n");   
			/**/		
				System.out.println("Enter the Employee ID: ");
		    		ID = strInput.nextLine();	    		
		    	
		    		System.out.println("EMPLOYEE DETAILS");
		 		
		    		while( ( record = br.readLine() ) != null ) {
		    			
		    			StringTokenizer st = new StringTokenizer(record,",");
		    			if( record.contains(ID) ) {
		    				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
		    			}
		    			
		    		}	    		
		    	
		    		System.out.println("\n\n");
		    	br.close();
				   
	    		System.out.println("Enter the new Name: ");
	    		newName = strInput.nextLine();    		
	    		System.out.println("Enter the new Age: ");
	    		newAge = strInput.nextLine();  
	    		System.out.println("Enter the new Address: ");
	    		newAddr = strInput.nextLine();  
	    		
	    		BufferedReader br2 = new BufferedReader( new FileReader(db) );
	    			
	    		while( (record2 = br2.readLine() ) != null ) {    			
	    			if(record2.contains(ID)) {
	    				bw.write(ID+","+newName+","+newAge+","+newAddr);
	    			} else {
	    			
	    				bw.write(record2);	
	    			}    			
	    			bw.flush();
	    			bw.newLine();
	    		}
	    		
	    		bw.close();
	    		br2.close();    		
	    		db.delete();    		
	    		boolean success = tempDB.renameTo(db);    		
	    		System.out.println(success);    		
	    		
	    }
	  

}