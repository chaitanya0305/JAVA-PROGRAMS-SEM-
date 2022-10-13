class MThread1 implements Runnable{
	public void run(){
		System.out.println("My thread is in running state.");
	}
	public static void main(String args[]){
		MThread1 obj = new MThread1();
		Thread tobj = new Thread(obj);
		tobj.start();
	}
}