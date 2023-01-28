import java.lang.*;
import java.util.*;
class SimpleIntrest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int amount, roi, tp;
		amount = sc.nextInt();
		roi = sc.nextInt();
		tp = sc.nextInt();
		System.out.println((amount * roi * tp)/100.00);
	}
}