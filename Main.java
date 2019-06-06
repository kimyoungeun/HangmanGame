import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		int count = 0;
		CheckAnswer a = new CheckAnswer();
		a.setAnswer("banana");
		
		for(int i =0 ; i<6; i++) {
			char ch = kb.next().charAt(0);
			boolean boo = a.checkChar(ch);
			System.out.println(boo);
			
			StringBuffer b = a.getter();
			boolean boo2 = a.checkAns(b);
			System.out.println("check whole answer: "+boo2);
		}
	
	}
}