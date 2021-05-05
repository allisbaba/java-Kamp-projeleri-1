package GameTask;

public class Main {
    public static void main (String [] args ){
        CustomerManager customerManager = new CustomerManager();
        Customer customer1 = new Customer(111, "asdsd","dksdk",11);
        customerManager.add(customer1.getFirstName());
        customer1.check(customer1); //yanlış da girsen doğrulandı diyor (customer classında bu metot)

        GamerManager gamerManager = new GamerManager();
        Gamer gamer1 = new Gamer(111,111,"ABİ");
        gamerManager.update(gamer1.getLevel());

        SaleManager saleManager = new SaleManager();
        Sale sale1 = new Sale("Fifa21",179.90);
        saleManager.update(sale1.getPrice());

        CampaignManager campaignManager = new CampaignManager();
        Campaign campaign1= new Campaign("Merhaba Yaz",35);
        campaignManager.add(campaign1.getName());

        campaign1.NewPrice(); // indirimli fiyatı yazdırmıyor (campaign classında bu metot)



    }
}
