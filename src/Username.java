import java.io.*;
import java.util.Scanner;

class Username{
    private String[] idArray;
    private int[] scoreArray;
    private String newId;
    private int count=0;
    private int newScore=0;

    public void printScore(){
        System.out.println("Your score : "+newScore);
    }

    public void updateScore(){
        newScore+=50;
    }

    public void callScorefile(){
        String fileName = "Scorefile.txt";
        Scanner inputStream = null;

        try{
            inputStream = new Scanner(new File(fileName)); 
        }catch(FileNotFoundException e){
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }

        while (inputStream.hasNextLine()){
            String line = inputStream.nextLine();
            count++;
        }
        inputStream.close();
    }

    public void setUserInfo(){
        String fileName = "Scorefile.txt";
        Scanner inputStream = null;
        int i=0;

        try{
            inputStream = new Scanner(new File(fileName)); 
        }catch(FileNotFoundException e){
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }

        idArray=new String[count+1];
        scoreArray=new int[count+1];
        
        while (inputStream.hasNextLine()){
            String str = inputStream.nextLine();
            String[] user = str.split(" ");
            int score = Integer.parseInt(user[1]);
            idArray[i] = user[0];
            scoreArray[i] = score; 
            i++;
        }
        inputStream.close();
    }

    public void setting(){
        Scanner keyboard=new Scanner(System.in);

        for(int j=0; j<1; j++){
            System.out.println("Enter your id: ");
            newId=keyboard.nextLine();
            for(int i=0;i<count;i++){
                if(newId.compareTo(idArray[i])==0){
                    System.out.println(newId+" already exists.");
                    j--;
                    break;
                }
            }
        }

        idArray[count]=newId;
        scoreArray[count]=newScore;

        newScore=0;
    }

    void swapScore(int i, int j) {
        int tempscore;
        tempscore=scoreArray[i];
        scoreArray[i]=scoreArray[j];
        scoreArray[j]=tempscore;
    }

    void swapId(int i, int j) {
        String temp;
        temp=idArray[i];
        idArray[i]=idArray[j];
        idArray[j]=temp;
    }

    public void sorting(){
        for(int i=0; i<=count-1; i++){
            for(int j=i+1; j<=count; j++){
                if(scoreArray[i]<scoreArray[j]){
                    swapScore(i,j);
                    swapId(i,j);
                }
            }
        }
    }

    public void saveRanking(){
        String fileName = "Scorefile.txt";
        PrintWriter outputStream = null;

        try{
            outputStream = new PrintWriter(fileName);
        }catch(FileNotFoundException e){
            System.out.println("Error opening the file" + fileName);
            System.exit(0); 
        }

        System.out.println("user name\t|\tscore");
        System.out.println("------------------------");

        for (int i=0; i<=count; i++){
            outputStream.println(idArray[i]+ " " + scoreArray[i]);
            System.out.println(String.format("%10s", idArray[i])+"\t|\t"+scoreArray[i]);
        }
        
        count=0;
        outputStream.close();
    }
}
