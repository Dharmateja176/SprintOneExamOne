import java.lang.*;
import java.util.*;
class Celsius{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cels = sc.nextInt();
		double f = 1.8 * cels + 32;
		System.out.println(f);
	}
}