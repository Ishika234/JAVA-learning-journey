import java.util.Scanner;
public class Lecture_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		Double num1 = sc.nextDouble();
		
		System.out.println("Enter the second Number :");
		Double num2 = sc.nextDouble();
		
		System.out.println("Select the opertaion you want to perform(1(+),2(-),3(*),4(/),5(%)) :");
		int op = sc.nextInt();
		if(op == 1) {
			Double add = num1 + num2;
			System.out.println("Sum : "+add);
		}
		else if(op == 2){
			Double sub = num1 - num2;  
			System.out.println("Sub : "+sub);
		}
		else if(op == 3) {
			Double mult = num1 * num2;
			System.out.println("Mult : "+mult);
		}
		else if(op == 4) {
			if(num2 == 0) {
				System.out.println("Denominator can't be ZERO.");
			}
			else {
			Double div = num1 / num2;
			System.out.println("Div : "+div);
			}
		}
		else if(op == 5) {
			if(num2 == 0) {
				System.out.println("Denominator can't be ZERO.");
			}
			else {
			Double mod = num1 % num2;
			System.out.println("Mod : "+mod);
			}
		}
		else {
			System.out.println("Invalid Operator.");
		}

	}

}
