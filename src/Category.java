import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

class Category{
  private String fileName;
  private String[] words = new String[50];
  private int ct = 0;
  private int menu;
  Scanner inputStream = null;

  public Category(int initial_menu){
    this.menu = initial_menu;
  }

  public void setMenuNum(int menu){
    this.menu = menu;
    this.ct = 0;
  }
  
  public String getFileName(){
    if(menu == 1)
      fileName = "animals.txt";
    else if(menu == 2)
      fileName = "sports.txt";
    else if(menu == 3)
      fileName = "foods.txt";
    else
      fileName = "brand names.txt";

    return fileName;
  }
  
  public String getWordFromFile(){
    Random rand = new Random();
    rand.setSeed(System.currentTimeMillis());
    try{
    inputStream = new Scanner(new File(getFileName()));
    }
    catch(FileNotFoundException e){
      System.out.println("Error opening the file");
      System.exit(0);
    }
    while (inputStream.hasNextLine()){
      words[ct] = inputStream.nextLine();
      ct += 1;
    }
    inputStream.close();
    return words[rand.nextInt(ct-1)];
  }
}

//random word should be returned
