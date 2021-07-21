package JavaProgram;

import java.util.Scanner;
	
public class Addition {
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,sum;
		Scanner prj=new Scanner(System.in);
		System.out.print("enter a integer");
		a=prj.nextFloat();
		System.out.print("enter b");
		b=prj.nextInt();
		prj.close();
		sum=a+b;
		//int a=10;
		//System.out.println(a);
		System.out.println(sum);
	}
}
