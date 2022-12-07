package JavaConceptssss;

public class Finallytrycatch {

	Finallytrycatch(){
		System.out.println("inside constuctor");
	}
	
	
	public int add(int a, int b) {
		return a+b;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		Finallytrycatch objFinallytrycatch = new Finallytrycatch();
    	  int Addresult = objFinallytrycatch.add(2, 3);
    	  System.out.println("Addresult:" + Addresult );
    	  int num1 = 25/0;
    	  System.out.println("num1");
      }
      catch(ArithmeticException e)
      {
      System.out.println(e);
	}
      finally 
      {
    	  System.out.println("finally block is always executed");
      }
     System.out.println("Rest of the code");
	}
}
