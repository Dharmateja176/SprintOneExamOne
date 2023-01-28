import java.lang.*;
import java.util.*;
class Expenses{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double branding = sc.nextDouble();
		double travel = sc.nextDouble();
		double food = sc.nextDouble();
		double logistics = sc.nextDouble();
		double total = branding + travel + food + logistics;
		System.out.printf("Total expenses : Rs.%.2fn", total);
		System.out.printf("Branding expenses percentage : %.2f%%\n", (branding/total)*100);
		System.out.printf("Travel expenses percentage : %.299\n", (travel/total) *100);
		System.out.printf("Food expenses percentage : %.2f%9n", (food/total) *100);
		System.out.printf("Logistics expenses percentage : %.2f%%n", (logistics/total) *100);
	}
}