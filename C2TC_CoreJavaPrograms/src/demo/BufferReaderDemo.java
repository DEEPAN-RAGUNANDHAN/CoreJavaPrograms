package demo;
import java.io.BufferedReader;
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException{
		BufferReader reader = new BufferReader(new InputStreamReader(System.in));
		System.out.println("enter your name:");
		String name =reader.readLine();
		System.out.println("enter your age:");
		int age =reader.readLine();
		System.out.println("enter your salary:");
		 =reader.readLine();

	}

}
