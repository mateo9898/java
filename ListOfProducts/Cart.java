package ListOfProducts;

import java.util.ArrayList;
import java.util.List;


public class Cart {

    protected List<Product> products = new ArrayList();

    public void add(Product product) {
        products.add(product);
    }

    public void print() {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        for (Product product : products) {
            System.out.println(product.getName() + " cena:" + df.format(product.getPrice()));
        }
    }

    public void total() {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        int sumOfMoneyToPay = 0;
        for (Product product : products) {
            sumOfMoneyToPay += product.getPrice();
        }

        System.out.println("Total to pay: " + df.format(sumOfMoneyToPay));
    }
}
