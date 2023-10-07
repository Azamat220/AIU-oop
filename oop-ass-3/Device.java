public class Device {
    private String type;
    private double price;
    private double weight;

    // Parameterized constructor
    public Device(String type, double price, double weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    // Getter for "type"
    public String getType() {
        return type;
    }

    // Setter for "type"
    public void setType(String type) {
        this.type = type;
    }

    // Getter for "price"
    public double getPrice() {
        return price;
    }

    // Setter for "price"
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for "weight"
    public double getWeight() {
        return weight;
    }

    // Setter for "weight"
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // You can add other methods specific to devices here if needed
}

