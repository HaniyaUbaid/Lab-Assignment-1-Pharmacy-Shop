public class Address {

private String street;
private String city;
private String postalcode;

    public Address(String street, String city, String postalcode) {
        this.street = street;
        this.city = city;
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String toString(){
        return String.format("Street:%s  City:%s Postalcode:%s",street,city,postalcode);


    }
}
