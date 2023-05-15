public class Sales {
    private String itemId;
    private double value;
    private int quantity;

    public Sales(String id, double value, int items) {
        this.itemId = id;
        this.value = value;
        this.quantity = items;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }
}
