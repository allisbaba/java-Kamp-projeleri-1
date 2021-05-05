package GameTask;

public class Customer {
    private int identicalId;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Customer(){
        identicalId = 1234567890;
        firstName = "Furkan";
        lastName = "Alliş";
        birthYear = 2000;
    }

    public Customer (int identicalId,String firstName, String lastName, int birthYear){
        this.identicalId = identicalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }



    public int getIdenticalId() {
        return identicalId;
    }
    public void setIdenticalId(int identicalId) {
        this.identicalId = identicalId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void check(Customer customer){

        if (customer.getIdenticalId() == this.identicalId){
            System.out.println("Müşteri kimlik numarası doğrulandı");
        }
        else{
            System.out.println("Müşteri kimlik numarası hatalı!");
        }
        if(customer.firstName.equals(this.firstName)){
            System.out.println("Müşteri adı doğrulandı.");
        }
        else{
            System.out.println("Müşteri adı hatalı!");
        }
        if(customer.lastName.equals(this.lastName)){
            System.out.println("Müşteri soy adı doğrulandı.");
        }
        else{
            System.out.println("Müşteri soy adı hatalı!");
        }
        if(customer.birthYear==this.birthYear){
            System.out.println("Müşteri doğum yılı doğrulandı.");
        }
        else{
            System.out.println("Müşteri doğum yılı hatalı!");
        }
    }

}

