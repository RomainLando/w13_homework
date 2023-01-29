import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> stock;

    public Shop(ArrayList<Product> stock) {
        this.stock = stock;
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void addItem(Product product){
        this.stock.add(product);
    }

    public void removeItem(Product product){
        this.stock.remove(product);
    }

    public double calculatePotentialProfits(){
        double profits = 0;
        for (Product item:stock) {
            profits += item.getCost() * item.calculateMarkup();
        }
        return profits;
    }
}
