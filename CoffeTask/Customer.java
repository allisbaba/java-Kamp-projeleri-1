package CoffeTask;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String identicalId;
    private int birthYear;

    public Customer(){}
    public  Customer(int id,String firstName,String lastName,String identicalId, int birthYear ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identicalId = identicalId;
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }

    public String getIdenticalId() {
        return identicalId;
    }

    public void setIdenticalId(String identicalId) {
        this.identicalId = identicalId;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
