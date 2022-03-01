/*
 *   File: uploadData.java
 *   Creator: Samuel T. White
 *   Created: Thursday Feb 10 2022 at 12:18:56 AM
 *   For: Upload 911 Vehicle Data to File 
 *   Description: This file will be run using bash where we will add data to the end of
 *   a file 
*/
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class uploadData{
   private static void countFileEntries(String argv){
      try{
         BufferedWriter writer = new BufferedWriter(new FileWriter("inputData.txt", true));
         writer.append(argv + "\n");
         writer.close();
      }catch(IOException e){
         e.printStackTrace();
      }
   }
    public static void main(String[] argv){
      System.out.println("Starting Process");
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
      LocalDateTime currentTime = LocalDateTime.now();
      String time = dtf.format(currentTime);
      System.out.println("Added: " + time);
      countFileEntries(time);
    }
}
