import java.util.*;
public class Main {
    public static void main(String [] args){

    Person p1=new Person("Haniya",20);
    Addree a1=new Address("36-B","Lahore","1234-3");
    Medicine m1=new Medicine("M001","Paracetamol",50.0,100,"PharmaCorp","B123",new Date(2025,08,15));
    PharmacyShop s1=new PharmacyShop(p1,a1,0);



    }
}
