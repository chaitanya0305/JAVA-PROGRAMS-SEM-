import java.io.*;

class myInput{
	public static void main(String[] args) throws IOException{
		String text;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the string/number");
		text = br.readLine(); 

		System.out.println(text);
	}
}