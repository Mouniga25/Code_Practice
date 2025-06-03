//21/2/25
package src;
import java.util.Date;
import java.util.Formatter;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Scanner;
import java.util.Locale; 
public class Day_1 {
	public static void main(String[] args) throws ParseException {	
		Scanner myDate = new Scanner(System.in);
		String Date1 ;
		Date1 = myDate.nextLine();
		//Date DateFormat = new Date();
		SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
		//String strDate = Date.format(DateFormat);
		Date dates = inputFormat.parse(Date1);
		
		System.out.println("give me Date format dd/MM/yyyy: "+Date1 );
		
		//DateFormat.after(DateFormat);
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MMM/yyyy");
		//String formattedDate = myDate1.format(strDate);
		//strDate = Date.format(DateFormat); 
		Date datess = outputFormat.parse(Date1);
		System.out.println("give me Date format dd/MMM/yyyy: "+  datess );
		
		String[] splits = Date1.split("/");
		try {
			int day = Integer.parseInt(splits[0]);   
			int month = Integer.parseInt(splits[1]); 
			int year = Integer.parseInt(splits[2]);
			boolean isLeap = Year.of(year).isLeap();
			if(isLeap){
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
		}
		catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid date in dd/mm/yyyy format.");
	}

}}