package JavaConceptssss;

class x{
	public void methodx() {
		System.out.println("class X method");
	}
}

class y extends x {
	public void methody() {
		System.out.println("class Y method");
	}
}



class MultiLevelInheritanceC1 extends y {
	public void methodz() {
		System.out.println("class z method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritanceC1 nnn = new MultiLevelInheritanceC1();
		nnn.methodx();
		nnn.methody();
		nnn.methodz();
	}

}
