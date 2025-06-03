package src;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Scanner;
public class Day_1again {
	public static void main(String[] args) {
		System.out.print("enter the Date is:" );
		Scanner scanner = new Scanner(System.in);
		String Date= scanner.nextLine();
 try {
	 SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
	 Date dates = inputFormat.parse(Date);
	 SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
	 Date dates_1 = outputFormat.parse(Date);
	 System.out.println("I want this format dd/MM/yyyy :" + Date);
	 System.out.println("I want this format dd/MMM/yyyy :"+ dates_1);
	  String[] splits = Date.split("/");
	  int year = Integer.parseInt(splits[2]);
	  boolean isLeap = Year.of(year).isLeap();
		if(isLeap){
	  
		  System.out.println("this is a leap year");
	  }
	  else {
		  System.out.println("this is a not leap year");
	  }
 }
 catch(Exception e) {
	 
 }
	}

}
