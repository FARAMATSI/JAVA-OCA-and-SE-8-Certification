package defaultPackage;

public class Mouse {
    static int MAX_LENGTH = 5; // class variable
    // stays in scope until the program ends
    int length; // instance variable
    // stays in the scope as long as the object of mouse exists.

    public void grow(int inches){ // inches is a local variable
        if(length<MAX_LENGTH){
            int newSize = length + inches; // newSize is a local variable
            length = newSize;
        }

    }
}
