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
    public static void main(String[] args) {
      //Presume This "fetches the file"

      //One of the esiest ways to use file I/O in Java
      //The reason this is freaking out is becuase it is saying that this code,
      //CAN thow an exception but we are not dong anyting with it
      try{
         BufferedReader reader = new BufferedReader(new FileReader("random.txt"));
      }catch(IOException e){
         e.printStackTrace();
      }
      try{
         //First write to a file the number of lines 
         int flag =0;
         BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
         //flag == 0 ? writer.write("Reee") : writer.write("\nfuck");
         if(flag == 0){ writer.write("Fuck");}
         else{
            writer.write("\nReee");
         }
         writer.close();
      }catch(IOException e){
         e.printStackTrace();
      }

    }
}
