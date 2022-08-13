package models;

public class students implements DTP {
    private Integer id;
    private String StudentName;
    private String Address;
    private String City;
    private String PostalCode;
    private String Country;

    public students(){}

    public students(String studentName, String address, String city, String postalCode, String country){
        this.StudentName=studentName;
        this.Address = address;
        this.City=city;
        this.PostalCode=postalCode;
        this.Country=country;
    }
    public students(Integer id, String studentName, String address, String city, String postalCode, String country){
        this.id=id;
        this.StudentName=studentName;
        this.Address = address;
        this.City=city;
        this.PostalCode=postalCode;
        this.Country=country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

}
