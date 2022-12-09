package JavaConceptssss;

public class finallywithoutexecptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int number = 25/5;
	System.out.println(number);
}
catch(NullPointerException e) {
	System.out.println(e);
}
finally {
	System.out.println("the execution of final block always happen");
}
System.out.println("after final the rest of the code");
	}

}
