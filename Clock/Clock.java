import java.util.Scanner;
public class Clock {
    //Parts of a clock, 
    //Second, minute, hour  
    private int minute; int second; int hour;
   public int getMinute(){
    return minute;
   } 
   public int getSecond(){
    return second;
   }
   public int getHour(){
    return hour;
   }

   public void updateHour(){
        if(this.hour == 23){
            this.hour = 00;
        }
        else{
            this.hour++;
        }
   }
   public void updateMinute(){
       if(this.minute == 59){
           this.updateHour();
           this.minute = 00;
       }
       else{
           this.minute++;
       }
   }
    public void updateSecond(){
       if(this.second== 59){
           this.updateMinute();
           this.second= 00;
       }
       else{
           this.second++;
       }
   } 

    public void printTime(int duration){
        for(int x = 0; x < duration; x++){
            System.out.println(this.hour + ":"+ this.minute+":"+this.second);
            this.updateSecond();
        }
    }

   //Constructor
   public Clock(int minute, int second, int hour){
       this.minute = minute;
       this.second = second;
       this.hour = hour;
   }
   public static void main(String[] args){
       System.out.println("Clock Program");
       Clock currTime = new Clock(0, 0, 0);
       currTime.printTime(3601);
       //System.out.println(currTime.getSecond());
   } 
}
