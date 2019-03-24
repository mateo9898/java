package ListOfProducts;

public class Main {

    public static void main(String[] args) {
        Cart cart1 = new Cart();
        Product product1 = new Product("Maslo", 3.4);
        Product product2 = new Product("Mleko", 1.9);
        Product product3 = new Product("Chleb", 4);
        Product product4 = new Product("Szynka", 5.5);

        cart1.add(product1);
        cart1.add(product2);
        cart1.add(product3);
        cart1.add(product4);

        cart1.print();
        cart1.total();


    }
}
