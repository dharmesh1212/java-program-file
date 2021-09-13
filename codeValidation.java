package practice;
import java.util.regex.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner; 
public class codeValidation {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
	
		 boolean IsDateValid=false;
		 String DOJ;

		 System.out.println("ENTER THE DATE= DD-MM-YYYY");
		 DOJ=sc.nextLine();
		 Check(DOJ);
		 
		 
		   
				
				//	 Date date1= sc.next();
				  
				 
//				 System.out.println("Enter Employee ID=");
					
//				String emp=sc.nextLine();
//				 emp=emp.toUpperCase();
//			    emp=emp.trim(); 
//			    emp1=emp.substring(3);
//			    
//				if(emp.startsWith("EMP") && emp1.matches("[0-9]{3}")) {  
//					
//				 System.out.println("employee id is= "+emp);
//				 IsValid=true;
//				 } 
				
//				
//			else {
//				System.out.println("invalid input enter again");
//				IsDateValid=false;
//			}  token id for git >>>>>>>>   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
			}
		 
	
	public static void Check(String s) {
		String DOJ;
	    boolean IsDateValid=false;
	   while(!IsDateValid) {
		  
		 
			if(s.length()<=10 && s.charAt(2)=='-' && s.charAt(5)=='-' && s.matches("[--/[0-9]]{10}")) {
			 		
				 System.out.println("DATE -  "+ s);
				IsDateValid=true;
			}
			 
			else {
				System.out.println("Invalid Format Please Enter Agian");
				IsDateValid=false;
			}
	
	 }
		  
	}
}
