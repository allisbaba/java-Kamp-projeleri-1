package CoffeTask;

public abstract class BaseCustomerManager extends Customer implements CustomerService {
    @Override
    public  void Save(Customer customer)  {
        System.out.println("Saved to db : "+ customer.getFirstName() );
    }
}
