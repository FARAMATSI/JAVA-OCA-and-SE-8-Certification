package defaultPack;
import java.util.*;
public class Main {
    private  static  List abjects = new ArrayList();
    protected void finalize(){
        System.out.println("Calling finalize");
    }
    public static void main(String[] args) {
        Finalizer f = new Finalizer();
        System.out.println("Hello world!");
    }
}