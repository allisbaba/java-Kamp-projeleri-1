package GameTask;

public class SaleManager implements BaseManager,ActiveManager {
    @Override
    public void add(String message) {

    }

    @Override
    public void delete(String message) {

    }

    @Override
    public void update(double message) {
        System.out.println("Ürün fiyatı :" +message);
    }
}
