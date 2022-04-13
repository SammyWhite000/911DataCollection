/*
 *    File: liquidCont.java
 *    Creator: Samuel T White
 *    Created: Sunday Apr 10 2022 at 09:35:11 PM
 *    For: 
 *    Description:
*/
class liquidCont{
    private final int maxLiquid = 100;
    private final int minLiquid = 0;
    private int waterLevel;

    public liquidCont(){
        waterLevel = 0;
    }

    public void printLevel(){
        System.out.println(waterLevel + "/" + maxLiquid);
    }

    //check if add or subtract, then determine if we can actually do operation
    public boolean checkValid(int amount, int type){
        if(type == 1){
            return (amount + waterLevel) < maxLiquid;
        }
        if(type == 0){
            return (waterLevel - amount) > minLiquid;
        }
        return false;
    }
    
    //Changes the water level of this current object, uses types to determine if 
    //it is to subtract or add water
    public void changeLevel(int amount, int type){
        if(type == 1 && checkValid(amount, type)){
            waterLevel += amount;
        }
        else if(type == 0 && checkValid(amount, type)){
            waterLevel -= amount; 
        }
        else if(type == 1){
            waterLevel = 100;
        }else{
            waterLevel = 0;
        }
    }

    //Function to add some water
    public void add(int amount){
        changeLevel(amount, 1);
    }

    //Function to get rid of some amount of water
    public void remove(int amount){
        changeLevel(amount, 0);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        liquidCont first = new liquidCont();
        liquidCont second = new liquidCont();
        first.add(50);
        first.printLevel();
        first.add(200);
        first.printLevel();
        first.remove(200);
        first.printLevel();
    }
}
    