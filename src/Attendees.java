import java.lang.*;
import java.util.*;
class Attendees{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		total = total*2;
		int x = total/7;
		System.out.println("Number of attendees on day 1 : "+ x);
		System.out.println("Number of attendees on day 2 : "+ 2*x );
		System.out.println("Number of attendees on day 3 : "+ x/2);
	}
}