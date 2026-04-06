// Invoice.java
package interfaces;
// Notice Invoice does NOT inherit from Employee. They are unrelated.
public class Invoice implements Payable {
    private String partNumber;
    private int quantity;
    private double pricePerItem;

    public Invoice(String part, int qty, double price) {
        this.partNumber = part;
        this.quantity = qty;
        this.pricePerItem = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}