import java.lang.*;
import java.util.*;
class TicketsSold{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		y = y - (5*x);
		int t = y/13;
		System.out.println("Number of children tickets sold : " + t);
		System.out.println("Number of adult tickets sold : " + (x+t));
		System.out.println("Number of senior tickets sold :" + (2*t));
	}
}