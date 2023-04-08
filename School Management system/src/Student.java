import java.util.ArrayList;

public class  Student{
    String StudentName;
    int StudentAge;
    public Student(){
        this.StudentName = "Farai";
        this.StudentAge = 20;
    }
    public String toString(){
        return  this.StudentName+" is "+this.StudentAge+" years old";
    }

}