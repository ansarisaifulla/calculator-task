package task.calculator;

import java.util.Scanner;

public class calci {
	
	public static float divide(float x,float y)
	{
		float a=0;
		a=x/y;
		return a;
	}
	public static long multiply(float x,float y)
	{
		long a=0;
		a=(long) (x*y);
		return a;
	}
	public static float add(float x,float y)
	{
		float a=0;
		a=x+y;
		return a;
	}
	public static float sub(float x,float y)
	{
		float a=0;
		a=x-y;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float a,b;
		System.out.println("Enter first number:-");
		a=sc.nextFloat();
		System.out.println("Enter second number:-");
		b=sc.nextFloat();
		System.out.println("Enter the choice of operation:-\n a)Addition choose 1\nb)Substraction choose 2\nc)Multiplication choose 3\nd)Division choose 4\n");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Addition is::");
				System.out.println(add(a,b));
				break;
			case 2:
				System.out.println("Substraction is::");
				System.out.println(sub(a,b));
				break;
			case 3:
				System.out.println("Multiplaction is::");
				System.out.println(multiply(a,b));
				break;
			case 4:
				System.out.println("Division is::");
				System.out.println(divide(a,b));
				break;
			default:
				System.out.println("Sorry you chose wrong option...");
				break;	
		}


	}

}
