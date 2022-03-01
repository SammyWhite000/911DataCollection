import java.io.*;
public class getData {
   private static int getNumberOfLines(){
      int counter = 0;
      try{
         BufferedReader reader = new BufferedReader(new FileReader("inputData.txt"));
         String line;
         while((line = reader.readLine()) != null){
            System.out.println(line);
            counter++;
         }
         reader.close();
      }catch(IOException e){
         e.printStackTrace();
      }

      return counter;
   }
    public static void main(String[] argv){
      System.out.println("Count number of line in a file");
      getNumberOfLines();
      System.out.println("Success!");
    }
}