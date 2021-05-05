package GameTask;

public class Campaign extends Sale{
    private String name;
    private double discount;


    public Campaign(){}

    public Campaign(String name, double discount){
        this.name = name;
        this.discount = discount;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void NewPrice(){
    double  NewPrice = (getPrice()-(getPrice()*getDiscount()/100));
        System.out.println(NewPrice);
    }

}
