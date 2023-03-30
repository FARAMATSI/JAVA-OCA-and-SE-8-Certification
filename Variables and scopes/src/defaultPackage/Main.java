package defaultPackage;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
    public void eat(int piecesOfCheese){
        int cheeseBites = 1; // can only be used inside this block (method)
    }

    /**
     * Local variable - the variables stay in scope of the particular block
     * instance variables - they stay in scope till the object exists
     * class variables - they stay in scope till the program ends
     */
    public  void eatingIfHungry(boolean hungry){
        if(hungry){
            int cheeseBites =1;
        }
        System.out.println(cheeseBites); // error because the variable is local to the if statement only
        System.out.println(hungry); // works because we are still in the scope of hungry variable
        {
            boolean teenyBit = true;
            System.out.println(hungry); // we are still inside hungry's scope and it works
        }
        // teenyBit = false; // won't work because we are now outside the block
    }

}