public class Product implements ISell{

    private String description;
    private IPlay type;
    private double cost;
    private double sellPrice;

    public Product(String description, IPlay type, double cost, double sellPrice) {
        this.description = description;
        this.type = type;
        this.cost = cost;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(){
        return (this.sellPrice - this.cost)/this.cost;
    }

    public String getDescription() {
        return description;
    }

    public IPlay getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
