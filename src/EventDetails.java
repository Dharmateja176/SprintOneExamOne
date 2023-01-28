import java.lang.*;
import java.util.*;
class EventDetails{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String type = sc.nextLine();
		int expected = sc.nextInt();
		char entry = sc.next().charAt(0);
		sc.nextLine();
		double proj = sc.nextDouble();
		System.out.println("Event Name : " + name);
		System.out.println("Event Type : " + type);
		System.out.println("Expected Count : " + expected);
		System.out.println("Paid Entry : " + entry);
		System.out.println("Projected Expense : " + proj + "L");
	}
}