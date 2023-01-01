package Day5Assignment;
import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("Please Enter a character :");
	      Scanner sc = new Scanner(System.in);
	      char ch = sc.next().charAt(0);
	      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	         System.out.println("The Given character is an vowel");
	      }else{
	         System.out.println("The Given character is a consonant");
	      }
	   }
	}