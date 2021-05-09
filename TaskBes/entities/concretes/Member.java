package TaskBes.entities.concretes;

import TaskBes.entities.abstracts.Entity;

public class Member implements Entity {
    String name;
    String lastName;
    String eMailAddress;
    String password;

    public Member(){}
    public Member(String name,String lastName,String eMailAddress,String password){
        this.name= name;
        this.lastName= lastName;
        this.eMailAddress=eMailAddress;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
