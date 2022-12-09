package JavaConceptssss;

public class Nestedtry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	try {
		int b = 39/0;
		System.out.println("going to divide");
	}
	catch(ArithmeticException e)
	{
	System.out.println(e);
	}
	try {
		int a[] = new int[5];
		a[0] = 6;
		a[1] = 2;
		a[2] = 5;
		a[3] = 8;
		a[4] = 9;
		a[5] = 4;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	System.out.println("Another Statement");
}
catch(Exception e) {
	System.out.println("Handled"); ///If exception handled in nested catch then it will not handled here.
}
System.out.println("Normal Flow");
	}

}
