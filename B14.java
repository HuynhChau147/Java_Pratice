import java.util.Locale;
import java.util.Scanner;

public class B14 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Input your name : ");
	String strN = input.nextLine();
	ProperName(strN);
	}

	private static void ProperName(String strN) {
		String s1 = (strN != null)? strN.trim() : "";
		String [] words = s1.split(" ");
		String result = "";
		for(String w : words)
		{ 
			result+= (w.length() >1 ? w.substring(0, 1).toUpperCase() + w.substring(1,w.length()).toLowerCase() : w) + " ";
		}
		System.out.println("Your name is " + result.trim());
	}
}
