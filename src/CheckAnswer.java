import java.io.IOException;

public class CheckAnswer{//The process of identifying whether a single character entered by a user is correct.
	
	public String hiddenString; //정답의 문자열
	private StringBuffer outputString; //유저의 입력에 따른 결과 문자열
	public StringBuffer inputString; //유저가 입력한 문자들의 모임
	public boolean check;
	
	public void setting (StringBuffer output) {
		outputString = output;
	}
	
	public StringBuffer getter() {
		return outputString;
	}
	
	public void setAnswer(String answerString) throws IOException {
		hiddenString = answerString;
		outputString = new StringBuffer();
		
		for(int i=0; i< hiddenString.length(); i++){
			outputString.append('-'); 
		}
		
		inputString = new StringBuffer();
		System.out.println(outputString); //출력해보는거 테스트용
	}
	
	 
	
	public boolean checkChar(char guess){
		boolean already = false;
		
		for(int i =0; i< inputString.length(); i++) {
			if(inputString.charAt(i) == guess){ //이미 입력된 건지 확인
				System.out.println("You have already typed this answer\nTry another one");
				already = true;
				check = false; //틀렸으니 false로 설정
			}
		}
		
		
		if(!already){
			inputString.append(guess); //입력된 문자열에 추가
			boolean success = false;
			
			for(int i=0; i< hiddenString.length(); i++){ //정답의 문자열 개수만큼 반복
				if(hiddenString.charAt(i) == guess){ //정답의 문자열에 입력 문자 있는지 확인
					outputString.setCharAt(i,guess); //있으면, ‘-‘ 를 해당 문자로 변경 
					success = true; //입력한 문자가 정답에 있었음을 표시	
				}
			}
			
			check = true;
			
			if (!success) {//입력한 문자가 정답에 없으면 
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
		}//하나의 메소드를 더 만들어서, 유저가 입력한 글자와 정답 문자열이 정확히 일치하면 true 반환*/
		
		else { 
			return false;
		}
	}
	
}
