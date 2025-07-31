public class TypeConvertion{

	public static void main(String[] args) {
		
		//implicit conversion
		byte b = 125;
		int a = b; 
		System.out.println(a);
		
		//explicit conversion
		int a1 = 257;
		byte k = (byte)a1;
		System.out.println(k);
		
		float f = 5.6f;
		int l = (int) f;
		System.out.println(l);
		
		//type promotion
		byte h = 10;
		byte c = 30;
		int result = h * c;
		System.out.println(result);
		
	}

}
