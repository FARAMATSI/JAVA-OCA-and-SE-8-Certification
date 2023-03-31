package defaultPack;

public class Main {
    public static void main(String[] args) {

        String one,two;
        one = new String("a");
        two = new String("b");
       // System.out.println(one);
        one = two;
      //  System.out.println(one);
        String three = one;
       // System.out.println(three);
        one = null;
    }
}