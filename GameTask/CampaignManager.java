package GameTask;

public class CampaignManager implements BaseManager,ActiveManager{
    @Override
    public void add(String message) {
        System.out.println("Yeni kampanyamız: "+message);

    }

    @Override
    public void update(double message) {

    }

    @Override
    public void delete(String message) {

    }
}
