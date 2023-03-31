package defaultPack;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Date date; // referance variable
        date = new Date();
        String name;

        name = "Farai Matsika";
        // We can use some methods which are part of the date

        System.out.println(date.getDate());
        System.out.println(name.toUpperCase());
    }
}