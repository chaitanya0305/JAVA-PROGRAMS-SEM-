class hello implements Runnable{
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println("Hello");
			try{
			Thread.sleep(500);
			}
			catch(Exception e){};		
		}
	}
}

class hi implements Runnable{
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println("Hi");
			try{
			Thread.sleep(500);
			}
			catch(Exception e){};	
		}
	}
}

class MThread2 extends Thread{
	
	public static void main(String args[]){
		hi obj1 = new hi();
		hello obj2 = new hello();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t2.start();
		t1.start();
	}
}