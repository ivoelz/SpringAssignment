package Classes;

import java.io.Serializable;

public class Sale implements Serializable {
    private double amount;
    private double tax;
    private double shipping;
    private String customer;
    private String country;

    public Sale(String customer, String country, double amount, double tax, double shipping) {
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
        this.shipping = shipping;
    }

    public Sale(String customer, double amount, double tax) {
        this.customer = customer;
        this.amount = amount;
        this.tax = tax;
    }

    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }


    public double getShipping() {
        return shipping;
    }
}
