public class oops {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.Brand = "Elkos" ;
        p1.thick = 2 ;
        p1.Color = "Green ";
        System.out.println("Pen Brand = "+p1.Brand+","+"Pen Color = " + p1.Color+","+"Pen Thickness (Out of 10) = " + p1.thick);


        Student Aajad = new Student();
        Aajad.Name = "Aajd Verma" ;
        Aajad.Age = 18 ;
        Aajad.Hieght = 5.8 ;
        System.out.println("Student Name ="+Aajad.Name+", Student Age =  "+Aajad.Age+", Student Hieght = "+Aajad.Hieght);

        Book Geeta = new Book();
        Geeta.Brand = "Geeta Publications";
        Geeta.Price = 199 ;
        Geeta.Pages = 1000 ;
        System.out.println("Book Brand = "+Geeta.Brand+",Book Price = "+Geeta.Price+", Book Pages = "+Geeta.Pages);



    }
}
class pen {
    String Brand;
    String Color ;
    int thick ;

    void setBrand(String setBrand){
         Brand = setBrand ;
    }
    void setColor (String newColor){
        Color = newColor;
    }
    void setThick (int newThick){
        thick = newThick;
    }



}

class Student {
    String Name ;
    int Age ;
    double Hieght ;

    void setName (String NewName){
        Name = NewName ;
    }
    void setAge (int newAge){
        Age = newAge ;
    }
    void setHieght (double newHieght){
        Hieght = newHieght ;
    }
}

class Book {
    String Brand ;
    int Price ;
    int Pages ;

    void setBrand (String newBrand){
        Brand = newBrand ;
    }
    void setPrice (int newPrice){
        Price = newPrice ;
    }
    void setPages (int newPages){
        Pages = newPages ;
    }
}