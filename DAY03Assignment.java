import java.util.Scanner;

public class DAY03Assignment 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		int A=num1+num2;
		int B=num1-num2;
		int C=num1*num2;
		int D=num1/num2;
		
		System.out.println("Addition of"+num1+"and"+num2+"is :"+A);
		System.out.println("Substraction of"+num1+"and"+num2+"is :"+B);
		System.out.println("Multiplication of"+num1+"and"+num2+"is :"+C);
		System.out.println("Division of"+num1+"and"+num2+"is :"+D);
		
	}

}
