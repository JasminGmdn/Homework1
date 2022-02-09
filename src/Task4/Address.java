package Task4;

public class Address {
    private String country;
    private String city;
    private String street;
    private int index;
    private int house;
    private int apartment;


    public Address(String country, String city, int index, String street, int house, int apartment){
        this.country = country;
        this.city = city;
        this.index = index;
        this.street = street;
        this.house= house;
        this.apartment= apartment;
    }


    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }


    public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }


    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index = index;
    }


    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }


    public int getHouse(){
        return house;
    }
    public void setHouse(int house){
        this.house = house;
    }


    public int getApartment(){
        return apartment;
    }
    public void setApartment(int apartment){
        this.apartment = apartment;
    }


    public static void main(String[] args) {
        Address myAddress = new Address("Украина", "г.Киев", 01033, "ул.Драгоманова", 27,105);

        System.out.print(myAddress.country + ",");
        System.out.print(myAddress.city + ",");
        System.out.print(myAddress.index + ",");
        System.out.print(myAddress.street + ",");
        System.out.print(myAddress.house + ",");
        System.out.print(myAddress.apartment + ".");
    }

}
