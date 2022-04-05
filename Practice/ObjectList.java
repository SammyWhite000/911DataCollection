import java.util.ArrayList;
//import java.io.*;
import java.util.Scanner;

//Class
public class ObjectList {
    //Name variable
    private String name;
    public void printName(){
        System.out.println(this.name);
    }
    public String getName(){
        return this.name;
    }
    public ObjectList(String Name){
        this.name = Name;
    }

    public static void main(String[] args){
        System.out.println("Working");
        Scanner scan = new Scanner(System.in);
        ArrayList<ObjectList> objList = new ArrayList<>();
        
        while(true){
            System.out.println("Enter a name, empty will stop");
            String name = scan.nextLine();
            if(name.isEmpty()){
                break;
            }
            objList.add(new ObjectList(name));
        }

        for(ObjectList obj: objList){
            System.out.println(obj.getName());
        }
        scan.close();
    }
}
