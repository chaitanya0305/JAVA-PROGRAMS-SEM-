import java.io.*;
public class CopyFile{
	public static void main(String args[]) throws IOException{
		
		FileInputStream in = new FileInputStream("Input.txt");
		FileOutputStream out = new FileOutputStream("output.txt");
		
		int c;
		int k = 0;
		while ((c = in.read()) != -1){
			out.write(c);
			System.out.print((char)c);
			k++;
		}
		System.out.println();
		System.out.println("No of Characters copied : " + k);
	}
} 	