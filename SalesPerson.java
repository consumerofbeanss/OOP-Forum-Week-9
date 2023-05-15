public class SalesPerson {
    private String id;
    private Sales[] salesHistory;
    private int count = 0;

    public SalesPerson(String id) {
        this.id = id;
        this.salesHistory = new Sales[100];
    }

    public SalesPerson(String id, Sales[] s, int c) {
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }

    public int getCount() {
        return count;
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s) {
        int c = getCount();
        this.salesHistory[c] = s;
        this.count = this.count + 1;
    }

    public Sales getSalesHistory(int i) {
        return salesHistory[i];
    }

    public double calcTotalSales() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += this.salesHistory[i].getValue() * this.salesHistory[i].getQuantity();
        }
        return total;
    }


    public Sales largestSale() {
        Sales largestSale = null;
        for (int i = 0; i < count; i++) {
            if (largestSale == null || largestSale.getValue() * largestSale.getQuantity() < salesHistory[i].getValue() * salesHistory[i].getQuantity()) {
                largestSale = salesHistory[i];
            }
        }
        return largestSale;
    }
}