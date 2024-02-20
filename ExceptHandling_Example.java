package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptHandling_Example {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		boolean flag =true;
		int a=0;
		int b=0;
		while(flag) {
		System.out.println("please enter number : ");
		b=0;
		a=0;
		try {
			b=sc.nextInt();
			flag=false;
			a=10/b;
		}catch(InputMismatchException e) {
			
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
	        System.out.print(e.getMessage());
	    } catch(Exception e) {
	    	
	    }
	
		
		System.out.println(a);

	}
	}

}
