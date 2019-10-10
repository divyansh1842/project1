import java.util.Scanner;
public class Function_Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1");
	int a=sc.nextInt();
	System.out.println("Enter number 2");
	int b=sc.nextInt();
	int c= sum(a,b);
	System.out.println("Sum of"+" "+ a+"and "+b+" "+ "is" + " "+c);
}
public static int sum(int a, int b)
{
	int sum=a+b;
	return sum;
}
}
