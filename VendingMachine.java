import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProducts(List<Product> products){
        this.products.addAll(products);
    }

    public Product getProduct(String name) {

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
}