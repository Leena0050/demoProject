package JavaConceptssss;

public class Trycatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		try {
			num1 = 0;
			System.out.println("Sending an exception");
			num2 = 65 / num1;
			System.out.println(num2);
		}
		/*
		 * catch(ArithmeticException e) {
		 * 
		 * this block will only execute if any arithmetic exception occurs in try block
		 * 
		 * System.out.println("We cant divide any number by zero"); }
		 */
		catch (Exception e) {
			/*
			 * This is a generic Exception handler which means it can handle /* all the
			 * exceptions. This will execute if the exception is not handled by previous
			 * catch blocks.
			 */
			System.out.println("Exception occurred");
			e.printStackTrace();

		}

		System.out.println("Try-catch ended");
	}

}
