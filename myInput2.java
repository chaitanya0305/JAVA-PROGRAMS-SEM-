import java.io.*;

class myInput2{
	public static void main(String[] args) throws IOException{
		char c;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the character");
		c = (char) br.read();
		System.out.println(c);
	}
}