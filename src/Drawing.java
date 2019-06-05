class Drawing{
  private boolean complete;
  private int stack;

  public Drawing(){
    stack =0;
    complete = true;
    //drawing gallow
  }

  public boolean show_stickman(boolean check){
    if(check == false){
      stack++;
    }
    if(stack == 0){
      //only drawing gallow
      draw_gallow();
      return complete;
    }
    else if(stack==1){
      //+drawing head
      draw_head();
      return complete;
    }
    else if(stack==2){
      //+drawing body
      draw_body();
      return complete;
    }
    else if(stack==3){
      //+drawing left arm
      draw_leftarm();
      return complete;
    }
    else if(stack==4){
      //+drawing right arm
      draw_rightarm();
      return complete;
    }
    else if(stack==5){
      //+drawing left leg
      draw_leftleg();
      return complete;
    }
    else if(stack==6){
      //+drawing right leg
      draw_rightleg();
      complete=false;
      System.out.println("End!\nHave better luck next time!");
      return complete;
    }
    else{
      complete =true;
      return complete;
    }
 
  }

   public void resetcouter(){
    stack=0;
    complete= true;
   }
   
  public void draw_gallow(){
    System.out.print("   _________________________\n");
    System.out.print("  /                        |\n");
    System.out.print(" /                         |\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|");
  }
  public void draw_head(){
    System.out.print("   _________________________\n");
    System.out.print("  /                        |\n");
    System.out.print(" /                         |\n");
    System.out.print("|                        |////|\n");
    System.out.print("|                        |^__^|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|");
    }
  public void draw_body(){
    System.out.print("   _________________________\n");
    System.out.print("  /                        |\n");
    System.out.print(" /                         |\n");
    System.out.print("|                        |////|\n");
    System.out.print("|                        |^__^|\n");
    System.out.print("|                         ^><^\n");
    System.out.print("|                         ||||\n");
    System.out.print("|                         ||||\n");
    System.out.print("|                         ||||\n");
    System.out.print("|                         \\||/\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|");
  }
  public void draw_leftarm(){
    System.out.print("   _________________________\n");
    System.out.print("  /                        |\n");
    System.out.print(" /                         |\n");
    System.out.print("|                        |////|\n");
    System.out.print("|                        |^__^|\n");
    System.out.print("|                         ^><^\n");
    System.out.print("|                        /||||\n");
    System.out.print("|                       / ||||\n");
    System.out.print("|                      /  ||||\n");
    System.out.print("|                         \\||/\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|");
  }
  public void draw_rightarm(){
    System.out.print("   _________________________\n");
    System.out.print("  /                        |\n");
    System.out.print(" /                         |\n");
    System.out.print("|                        |////|\n");
    System.out.print("|                        |^__^|\n");
    System.out.print("|                         ^><^\n");
    System.out.print("|                        /||||\\ \n");
    System.out.print("|                       / |||| \\\n");
    System.out.print("|                      /  ||||  \\\n");
    System.out.print("|                         \\||/\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|\n");
    System.out.print("|");
  }
  public void draw_leftleg(){
    System.out.print("   _________________________\n");
    System.out.print("  /                        |\n");
    System.out.print(" /                         |\n");
    System.out.print("|                        |////|\n");
    System.out.print("|                        |^__^|\n");
    System.out.print("|                         ^><^\n");
    System.out.print("|                        /||||\\ \n");
    System.out.print("|                       / |||| \\\n");
    System.out.print("|                      /  ||||  \\\n");
    System.out.print("|                         \\||/\n");
    System.out.print("|                         //\n");
    System.out.print("|                        //\n");
    System.out.print("|                       //\n");
    System.out.print("|                      //\n");
    System.out.print("|");
  }
  public void draw_rightleg(){
    System.out.print("   _________________________\n");
    System.out.print("  /                        |\n");
    System.out.print(" /                         |\n");
    System.out.print("|                        |////|\n");
    System.out.print("|                        |^__^|\n");
    System.out.print("|                         ^><^\n");
    System.out.print("|                        /||||\\ \n");
    System.out.print("|                       / |||| \\\n");
    System.out.print("|                      /  ||||  \\\n");
    System.out.print("|                         \\||/\n");
    System.out.print("|                         //\\\\ \n");
    System.out.print("|                        //  \\\\\n");
    System.out.print("|                       //    \\\\ \n");
    System.out.print("|                      //      \\\\ \n");
    System.out.print("|");
  }
}
