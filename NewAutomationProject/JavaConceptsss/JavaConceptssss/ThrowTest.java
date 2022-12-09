package JavaConceptssss;

public class ThrowTest {
	 static void validate(int age) {
			if (age < 18)
				throw new ArithmeticException("not valid");
			else
				System.out.println("welcome to vote");
		}

		public static void main(String args[]) {
			//If dont give static in method then create object then call the method
			validate(13);
			System.out.println("rest of the code...");
		}

	}
// if you get any exception on line no. 6 then it will not execute the line no. 14