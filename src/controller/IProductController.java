package controller;

import model.Product;

import java.util.List;

public interface IProductController {

    Product addProduct(String name, int preis);

    void updateProduct(String name, int preis);

    List<Product> getAll();

    void deleteProduct(String name);

}
