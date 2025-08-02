import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) throws IOException {
		{
  			//using BufferReader
  			System.out.println("Enter first number:");
  			
  			InputStreamReader in = new InputStreamReader(System.in);
  			BufferedReader bf = new BufferedReader(in);
  			
  			int num = Integer.parseInt(bf.readLine());
  			System.out.println(num);
  			
  			
  			//using Scanner
  			System.out.println("Enter second number:");
  			Scanner sc = new Scanner(System.in);
  			int num1 = sc.nextInt();
  			
  			System.out.println(num1);
  			
  			bf.close();
  		
		}
  }
}
