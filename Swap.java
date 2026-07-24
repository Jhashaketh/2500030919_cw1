import java.util.Scanner;
public class Swap{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num1");
		int num1=sc.nextInt();
	System.out.println("Enter a num2");
		int num2=sc.nextInt();
   sc.close();
	int temp=num1;
	    num1=num2;
	    num2=temp;
   System.out.println("Num1 after swap is:"+num1);
   System.out.println("Num2 after swap is:"+num2);
}}