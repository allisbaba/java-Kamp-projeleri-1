package CoffeTask;

public class Main {
    public static void main(String [] args) throws Exception {

      // Customer customer1 = new Customer();
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
        customerManager.Save(new Customer(12,"Furkan","Alliş","18920065832",2000));

    }
}
