import java.lang.*;
import java.util.*;
class Values2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Integer value - " + sc.nextInt());
		System.out .println("Double value = " + sc.nextDouble());
		System.out .println("Boolean value = " + sc.nextBoolean());
		System.out .println(" char value = " + sc.next().charAt(0));
		sc.nextLine();
		System.out.println("String value = " + sc.nextLine());
	}
}