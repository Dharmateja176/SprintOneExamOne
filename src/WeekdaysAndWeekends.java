import java.lang.*;
import java.util.*;
class WeekdaysAndWeekends{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double salary = sc.nextDouble();
	salary = salary - 800;
	double y = salary/130;
	System.out.println((int)y+10);
	System.out.println((int)y);
	}
}