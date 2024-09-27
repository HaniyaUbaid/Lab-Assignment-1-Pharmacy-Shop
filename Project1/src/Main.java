import java.util.*;
public class Main{
    public static void main(String[] args){

        Person p1=new Person("Haniya",20);
        Address a1=new Address("36-B","Lahore","1234-3");
       Medicine m1=new Medicine("M001","Paracetamol",50.0,100,"PharmaCorp","B123",new Date(2025,8,15));
        PharmacyShop s1=new PharmacyShop(p1,a1,0);
        //System.out.println("Enter medicine id");
        Scanner sc=new Scanner(System.in);
        //String id=sc.next();
        //String Id=s1.searchMedicineId(id);
        //System.out.println(Id);

        System.out.println("Enter medicine name");
        String name=sc.next();
        String result=s1.searchMedicineName(name);
        System.out.println(result);







    }
}
