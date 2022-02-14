/*
 *   File: uploadData.java
 *   Creator: Samuel T. White
 *   Created: Thursday Feb 10 2022 at 12:18:56 AM
 *   For: Upload 911 Vehicle Data to File 
 *   Description: This file will be run using bash where we will add data to the end of
 *   a file 
*/
import java.io.*;
class uploadData{
    public static void main(String[] args){
      System.out.println("It is working");
      try{
         //First start reading the data file and create a temp file
         BufferedReader reader = new BufferedReader(new FileReader("data.txt"));

         File tempFile = File.createTempFile("tempFile", null);
         String loc = tempFile.getAbsolutePath();
         //System.out.println(loc);

         //Start writing to the temp file
         BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
         //Start writing to the file
         //Check if we have looped through once
         int flag = 0;
         String lineByLine;
         //Loop through file
         while((lineByLine = reader.readLine()) != null){
            if(flag == 0){
               flag = 1;
               int increase = Integer.parseInt(lineByLine) + 1;
               writer.write(String.valueOf(increase));
               writer.write("\n");
            }
            else{
               writer.write(lineByLine);      
               writer.write("\n");
            }
         }
         reader.close();
         writer.close();

         //Clear all the contents of data
         /*
         PrintWriter clearData = new PrintWriter("data.txt");
         clearData.print("");
         clearData.close();
         */

         //Once I write to temp file, close and open buffer writer and reader
         //Reader of temp file
         //Writer of data.txt
         BufferedReader tempReader = new BufferedReader(new FileReader("output.txt"));
         BufferedWriter dataWriter = new BufferedWriter(new FileWriter("data.txt"));
         while((lineByLine = tempReader.readLine()) != null){
            dataWriter.write("data.txt");
            dataWriter.write("\n");
         }
         tempReader.close();
         dataWriter.close();
      }catch(IOException e){
         e.printStackTrace();
      }
    }
}
