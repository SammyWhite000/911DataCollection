/*
 *    File: random.java
 *    Creator: Samuel T White
 *    Created: Sunday Apr 10 2022 at 09:02:29 PM
 *    For: 
 *    Description:
*/
import java.util.Scanner;
import java.util.ArrayList;
class random{
    public static void cubeNum(){
        Scanner scan = new Scanner(System.in);
        while(true){
            String line = scan.nextLine();
            if(line.equals("end")){
                break;
            }
            int num = Integer.parseInt(line);
            System.out.println(num * num * num);
        }
        scan.close();
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        cubeNum();

    }
}
    