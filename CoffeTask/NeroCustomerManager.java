package CoffeTask;

import mypackage.KPSPublicSoap12Stub;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void Save(Customer customer) {
        System.out.println("Saved to db : "+ customer.getFirstName());
    }
}
