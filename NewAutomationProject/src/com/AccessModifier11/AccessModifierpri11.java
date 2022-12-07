package com.AccessModifier11;

public class AccessModifierpri11 {

	private void privacessmodifier()
	{
		System.out.println("You are using private access specifier");
	}
	
	public class AccessModifierPricall{
		public static void main(String[] args) {
			//Private
			System.out.println("Private Access Specifier");
			AccessModifierpri11 obj = new AccessModifierpri11();
			// trying to access private method of another class
			//obj.display();
		}
		
	}
}
