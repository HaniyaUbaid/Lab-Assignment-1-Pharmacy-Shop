public class Medicine {
    private String medicineId;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;
    private String batchNumber;
    private Date date;

    public Medicine(String medicineId, String name, double price, int quantity, String manufacturer, String batchNumber, Date date) {

        this.medicineId = medicineId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.batchNumber = batchNumber;
        this.date = date;

    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public String toString() {
        return String.format("medicineId=%s  name=%s price=%d  quantity=%d manufacturer=%s  batchNumber=%s  date=%s",
                medicineId,name,price,quantity,manufacturer,batchNumber,date);


    }
}
