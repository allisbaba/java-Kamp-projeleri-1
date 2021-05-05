package GameTask;

public class GamerManager implements BaseManager,ActiveManager {

    @Override
    public void add(String message) {
        System.out.println();
    }

    @Override
    public void delete(String message) {

    }

    @Override
    public void update(double message) {
        System.out.println("Yeni leveliniz güncellendi :"+message);
    }
}
