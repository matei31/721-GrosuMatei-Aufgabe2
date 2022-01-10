package controller;

import model.Product;

import java.util.List;
import java.util.Objects;

public class ProductController implements IProductController{
    private final List<Product> productList;


    public ProductController(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }


    @Override
    public Product addProduct(String name, int preis) {
        Product  newProduct = new Product(name, preis);
        productList.add(newProduct);
        return newProduct;
    }

    @Override
    public void updateProduct(String name, int preis) {
        for(Product product: productList) {
            if(Objects.equals(product.getName(), name)){
                product.setPreis(preis);
            }
        }
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void deleteProduct(String name) {
        productList.removeIf(product -> Objects.equals(product.getName(), name));
    }
}
