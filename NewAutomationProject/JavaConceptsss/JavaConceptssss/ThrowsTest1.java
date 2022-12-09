package JavaConceptssss;

import java.io.IOException;

public class ThrowsTest1 {
	void m() throws IOException {
		throw new IOException("device error"); //Checked exception
	}
	
	void n() throws IOException{
		m();
	}
	
	void p() {
		try {
			n();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsTest1 obj = new ThrowsTest1();
		obj.p();
		System.out.println("Normal flow....");
	}
}
