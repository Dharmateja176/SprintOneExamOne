import java.lang.*;
import java.util.*;
class Ascii{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		int asc = (int)input;
		if(Character.isAlphabetic(input)){
			System.out.println("int:"+asc);
			System.out.println("float:"+(float)asc);
			System.out.println("byte:"+(byte)asc);
			System.out.println("short:"+ (short)asc);
		}else{
			System.out.println("Invalid");
		}
	}
}