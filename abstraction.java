interface A{
	void a();
	void b();
}

interface B{
	void c();
	void d();
}

class M implements A,B{
	public void a(){System.out.println("I am a");}
	public void b(){System.out.println("I am b");}
	public void c(){System.out.println("I am c");}
	public void d(){System.out.println("I am d");}
}

class abstraction{
	
	public static void main(String[] args){
	M b = new M();
	b.a();
	b.b();
	b.c();
	b.d();
}
}