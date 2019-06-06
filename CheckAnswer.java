import java.io.IOException;

public class CheckAnswer{//The process of identifying whether a single character entered by a user is correct.
	public String hiddenString; 			//String of the correct answer
	private StringBuffer outputString; 		//Result string based on user input
	public StringBuffer inputString; 		//A set of characters entered by a user.
	public boolean check;
	
	public void setting (StringBuffer output) {
		outputString = output;
	}
	
	public StringBuffer getter() {
		return outputString;
	}
	
	public void setAnswer(String answerString) throws IOException { //Initialize to '-' by the length of the correct string.
		hiddenString = answerString;
		outputString = new StringBuffer();
		
		for(int i=0; i< hiddenString.length(); i++){
			outputString.append('-'); 
		}
		
		inputString = new StringBuffer();
		System.out.println(outputString);
	}

	public boolean checkChar(char guess){ //A method that checks whether the user's input character is correct.
		boolean already = false;
		
		for(int i =0; i< inputString.length(); i++) {
			if(inputString.charAt(i) == guess){ //Check that user input is already entered.
				System.out.println("이미 입력한것입니다");
				already = true;
				check = false;
			}
		}
		
		if(!already){
			inputString.append(guess); //Add user's input to inputString
			boolean success = false;
			
			for(int i=0; i< hiddenString.length(); i++){ //Repeat by the number of strings in the correct answer.
				if(hiddenString.charAt(i) == guess){ 	//Verify that the text of the correct answer contains an input character.
					outputString.setCharAt(i,guess); 	//If so, change '-' to the letter
					success = true; //Indicates that the entered character was in the correct answer.
				}
			}
			
			check = true;
			
			if (!success) {//The character entered is not in the correct answer.
				check = false;
			}
		}
		
		System.out.println(outputString);	
		return check;
	}
	
	public boolean checkAns(StringBuffer outputString){
		String output = outputString.toString();
		if(hiddenString.compareTo(output)==0){
			return true;
		}//Returns true if the correct answer string matches the character entered by the user.
		else { 
			return false;
		}
	}
	
}