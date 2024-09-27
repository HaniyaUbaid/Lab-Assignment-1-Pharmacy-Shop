public class PharmacyShop {

    private Person owner;
    private Address address;
    private int medicinecount=3;
    Medicine[] list=new Medicine[100];

    public PharmacyShop(Person owner, Address address, int medicinecount) {
        this.owner = owner;
        this.address = address;
        this.medicinecount =medicinecount;
    }


    {

        list[0]=new Medicine("M001","Paracetamol",50.0,100,"PharmaCorp","B123",new Date(2025,8,15));
        list[1]=new Medicine("M002","Ibuprofen",75.0,80,"Healthmed","B124",new Date(2024,12,10));
        list[2]=new Medicine("M003","Amoxicllln",120.0,50,"BioPharma","B125",new Date(2026,05,20));


    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {

        this.owner = owner;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getMedicinecount() {
        return medicinecount;
    }

    public void setMedicinecount(int medicinecount) {
        this.medicinecount = medicinecount;
    }
    /*public String searchMedicineId(String Id) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getMedicineId().equals(Id){
                break;}


        return "Medicine found";}
        return "Medicine not found";
    }*/


    public String searchMedicineName(String Name) {
        for (int i = 0; i < list.length; i++) {
            if(list[i].getName().equals(Name))
             {

            break;}
            return "Medicine found";

        } return "Medicine not found";
    }




     }






