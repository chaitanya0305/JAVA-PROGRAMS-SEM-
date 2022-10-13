import java.io.*;
public class Reader{
	public static void main(String args[]) throws IOException{
		
		File f1 = new File("Input.txt");
		BufferedReader br = new BufferedReader(new FileReader(f1));
		String str;
		int k = 0;
		while ((str = br.readLine()) != null){
			k++;
			System.out.print(str);
		}
		System.out.println();
		System.out.println("No of Lines Read : " + k);
	}
}