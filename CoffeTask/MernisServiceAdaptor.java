package CoffeTask;

import mypackage.KPSPublicLocator;

public class MernisServiceAdaptor implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        boolean result = false;
        try {
            result = new KPSPublicLocator().getKPSPublicSoap().TCKimlikNoDogrula(28861499108L,"Engin","Demiroğ",1985);

        } catch (Exception ex) {
            System.out.println("Not a valid person!");
        }
        return result;
    }
}

//result = client.TCKimlikNoDogrula(Long.parseLong(customer.getIdenticalId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthYear());



