import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println(infiniteCall(10));
		System.out.println("MY TEST PUSH");
	}
	
	public static int infiniteCall(int a) {
		
		if(a < 1) {
			return 0;
		}
		
		return infiniteCall(a-1);
	}

}
