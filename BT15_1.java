import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class BT15 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Input a number you want tranfer to binary code : ");
	int a = input.nextInt();
	Binary(a);
}

private static void Binary(int a) {
	ArrayList<String> List = new ArrayList<>();
	int d = a;
	do
	{
		String b = Integer.toString(d%2) ;
		List.add(b);
		d = d/2;
	}
	while(d != 0);
	Collections.reverse(List);
	System.out.println(a +" - "+ List);
}
}
