package JavaConceptssss;

import java.io.FileOutputStream;

public class Trywithresourcefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\Simpli\\Project1\\NewAutomationProject\\JavaConceptsss\\JavaConceptssss\\abcd.txt"))
     {
    	 String msg = "Welcome to java";
    	 byte byteArray[] = msg.getBytes(); // converting string into byte array
		 fileOutputStream.write(byteArray);
    	 System.out.println("Message writtn to file succesfully");   			 

     
     }
    	catch(Exception e) {
    		System.out.println(e);
    		e.printStackTrace();
    	}
	}

}
