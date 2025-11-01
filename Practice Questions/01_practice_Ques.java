import java.util.Scanner;
public class Lecture_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		Float radius = sc.nextFloat();
		
		Float area = 3.14F * radius * radius;
		Float perimeter = 2 * 3.14F *radius;
		
		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + perimeter);
	}

}
