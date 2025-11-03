//Two ways for printing
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *
public class Pattern_1 {

	public static void main(String[] args) {
		//first code
		for(int i =0;i<5;i++) 
	    {
			for (int j = 1; j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println("*");
		}
		
		
		//second code
		for(int i = 1; i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
