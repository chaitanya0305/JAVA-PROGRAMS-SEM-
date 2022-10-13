class MThread extends Thread{
	public void run(){
		System.out.println("My thread is in running state.");
	}
	public static void main(String args[]){
		MThread obj = new MThread();
		obj.start();
	}
}