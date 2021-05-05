package GameTask;

public class CustomerManager implements BaseManager{

    @Override
    public void add(String message) {
        System.out.println("Müşteri eklendi: " +message);
    }

    @Override
    public void delete(String message) {
        System.out.println("Müşteri silindi: " +message);
    }
}
