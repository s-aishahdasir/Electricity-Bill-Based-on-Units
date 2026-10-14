import java.util.Scanner;
import java.text.DecimalFormat;

public class topic2prob1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00"); 
		
		int units = sc.nextInt();
		double price = 0;
		
		
		if (units <= 100) {
			 price = units*1.2 ;
		} else if (units <= 200) {
			 price = (100*1.2) + ((units-100)*2) ;
		} else {
			  price = (100*1.2) + (100*2) + ((units-200)*3); }
		
		System.out.print("Total bill: RM" + df.format(price));
		
	}
	
}
		