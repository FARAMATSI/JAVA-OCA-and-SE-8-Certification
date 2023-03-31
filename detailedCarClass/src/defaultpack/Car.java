package defaultpack;

public class Car {
    String carName;
    public  void sound(){
        System.out.println("car makes too much noise");
        // This is a method, which is part of the car class.
    }
    public void setName(String name){
     this.carName = name;
    }
    public String getName(){
        return this.carName;
    }
}
