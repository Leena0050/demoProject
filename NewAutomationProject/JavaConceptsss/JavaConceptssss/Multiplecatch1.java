package JavaConceptssss;

public class Multiplecatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		try {
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException");

	}
		catch(Exception e)
		{
			System.out.println("Parent execption");
		}
System.out.println("rest of the code");
}
}
