package SaleCase;

import java.time.LocalDateTime;

public class OrderData {

    private String companyName;
    private int amount;
    private LocalDateTime orderDateTime;

    public OrderData(String companyName, int amount, LocalDateTime orderDateTime) {
        this.companyName = companyName;
        this.amount = amount;
        this.orderDateTime = orderDateTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }
}
