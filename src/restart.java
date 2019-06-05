import java.util.Scanner;

public class restart {

	public boolean ask(String str) {

	Scanner s = new Scanner(System.in);

	System.out.println("Replay?(y/n)");
  System.out.println(str);
	String YN = s.next();
  
	if(YN.equals("N")|| YN.equals("n")) {

		return false;

	}

	return true;

	}

}
