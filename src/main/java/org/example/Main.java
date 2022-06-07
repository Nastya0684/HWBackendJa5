package org.example;

public class Main {
    public static void main(String[] args) {
        MarketService marketService = new MarketService();

        Product product = new Product();
        product.setPrice(70);
        product.setTitle("Banana");
        product.setCategoryTitle("Food");

        Product createdProduct = marketService.createProduct(product);
        System.out.println(createdProduct);

        System.out.println(marketService.getProduct(createdProduct.getId()));

        marketService.getProducts();

        createdProduct.setPrice(100);

        System.out.println(marketService.setProduct(createdProduct));

        marketService.deleteProduct(createdProduct.getId());


    }
}
