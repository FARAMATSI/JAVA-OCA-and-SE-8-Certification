package defaultPack;

import javax.swing.*;

public class Main {
    //Instance and Class variables have no need of initialization as they are automatically given
    // some certain values upon creation
    // given a default value

    /*
     Default initialization values

     ..boolean - false
     ..byte,short,int,long - 0
     ..float,double - 0.0
     ..char - '\u0000' (NULL)
     ..All object reference (everything else) - NULL
     */
    static int a; // This is a class variable
    int u = 100; // instance variable
    public static void main(String[] args) {

        /**
         * Valid identifiers
         *
         * $OKIdentifier
         * _alsoOKIdentifier
         * __StillOKbutnotGood$
         */
        // e.g
        int $OKIdentifier =1;
        int __StillOKbutnotGood$ =3;

        /**
         * int 3DPointClass //  The name should not start with a digit, rather choose to start with a $ or _ or alphabet letter
         * int hollywood@vine // should not contain special characters such as @ or #
         * int *$coffe // cant start with an asterisk either start with _ or alphabet letter or $
         * int public // this is a reserved word, cant be used as an identifier
         */

        //Camel Casing
        /**
         * words start with a small letter and a Capital letter is used to represent a concatenation e.g
         * int myFirstNumberisOneOr1
         * Methods and variable names are the ones to start with small letters
         * Classes and interface names should start with upper case letters
         */
        System.out.println($OKIdentifier+" "+ __StillOKbutnotGood$);

        //Local variables
        /**
         * are variables defined inside methods or certain blocks defined.
         * must be initialized before being used
         * They do not have a meaningful value before they are initialized and they contain garbage data before initialization
         */
        //..We cannot create a method  inside a method, so we have to go to the Main Class and create there
    }
    //Importance of intialization
    /**
     public int notValid() {
     int y = 10;
     int x;
     int reply = x+y; // we cant start using x whilst x is not initialized
     return reply;
     }
     */
    public int valid(){
        int y = 10;
        int x = 1;
        int reply = x+y;
        return reply;
    }
    public void findAnswer(boolean check){
        int answer;
        int onlyOneBranch;
        if(check) {
            onlyOneBranch = 1;
        }
        else {
            answer = 2;
        }
        /**
         * This one wont compile because we tried to use the two variables at the end, yet they had not been initialized at first
         * So yes, it was initialized inside if statements but that is only if the condition is true meanign that the compiler already saw that happening, the state when the condition is false
         * The variable wont be initialized
         * */
        System.out.println(answer);
       // System.out.println(onlyOneBranch);
        }
    }
}