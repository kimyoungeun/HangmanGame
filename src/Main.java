import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException{
    Scanner keyboard = new Scanner(System.in); 
    int catN;
    String cty;
    String gWord;
    String separationLine= "======================================================================";
    System.out.println(separationLine);
    System.out.print("   \n");
    System.out.print("                           \n");
    System.out.print("                           \n");
    System.out.print("                         |////|    ___________\n");
    System.out.print("                         |^__^|   |           |\\\n");
    System.out.print("                          ^><^    |  -Hello-  |\\\n");
    System.out.print("                         /||||\\   |___________|\\\n");
    System.out.print("                        / |||| \\__|           \n");
    System.out.print("                       /  ||||    |\n");
    System.out.print("                          \\||/    |\n");
    System.out.print("                          //\\\\ \n");
    System.out.print("                         //  \\\\\n");
    System.out.print("                        //    \\\\ \n");
    System.out.print("                       //      \\\\ \n");
    System.out.print(" \n");
  
    System.out.println("Welcome to Hangman");
    
    System.out.println(separationLine);
//---------------------------//Ask for category
Username un = new Username();
boolean restart= true;
while(restart){
    
      System.out.println(separationLine + "\nType your category number:\n  1.- Animals\n  2.- Sports\n  3.- Food\n  4.- Brand names\n"+ separationLine);
    
    catN= keyboard.nextInt();
    //Call category class//
    Category ct= new Category(catN);
    
    gWord= ct.getWordFromFile();
    //System.out.println(gWord);
    //Check answer class
   CheckAnswer ca= new CheckAnswer();
    Drawing dr= new Drawing();
    restart re =new restart();
    System.out.println("\n"+separationLine);
    un.printScore();
    System.out.println("\nGuess the word:");
    ca.setAnswer(gWord);
    
    boolean CorrectA=false;
    boolean noOportunities= true;
    dr.resetcouter();
    System.out.println("\n"+separationLine);
    
   //game loop
    while(!CorrectA && noOportunities) {
      char ch = keyboard.next().charAt(0);
      System.out.println("\n"+separationLine);
      un.printScore();
      System.out.println("\nGuess the Word:");
      boolean currentWord = ca.checkChar(ch);
      noOportunities=dr.show_stickman(currentWord);
      //System.out.println(currentWord);
      StringBuffer b = ca.getter();
      CorrectA = ca.checkAns(b);
      //System.out.println("check whole answer: "+CorrectA);
      if(CorrectA==true){
        System.out.print("\nCongratulations\n You won!!!!\n");
        restart =re.ask(separationLine);
        un.updateScore();
      }
      if(noOportunities==false){
           restart=false;
           System.out.println("\nThe answer was: "+ gWord);
        }

      System.out.println("\n"+separationLine);
    }
    }
    un.callScorefile();
    un.setUserInfo();
    un.setting();
    System.out.println("\n"+separationLine);
    un.sorting();
    un.saveRanking();
    System.out.println("\n"+separationLine +"\nGAME OVER");
    System.out.println("\n"+separationLine);
  }

}
