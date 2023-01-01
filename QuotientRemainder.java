package Day5Assignment;
import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int dividend , divisor, quotient, remainder;
	     
	      Scanner my_scanner = new Scanner(System.in);
	      
	      System.out.print("Enter the value of dividend : ");
	      dividend = my_scanner.nextInt();
	      System.out.print("Enter the value of divisor : ");
	      divisor = my_scanner.nextInt();
	      quotient = dividend / divisor;
	      remainder = dividend % divisor;
	      System.out.println("The quotient is " + quotient);
	      System.out.println("The remainder is " + remainder);
	   }
	}