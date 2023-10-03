import javax.naming.Name;
import java.util.*;

public class Oops2 {
    public static void main(String[] args) {
        Student1 Aajad = new Student1("Aajad Verma");
        System.out.println(Aajad.Name);

    }
}

class Student1 {
   String Name ;
   int Age ;
   int Hieght ;

   Student1 (String Name){
       this.Name = Name ;
   }
   Student1 (int Age ){
       this.Age = Age ;
   }
   Student1 (int Hieght) {
       
   }
}
