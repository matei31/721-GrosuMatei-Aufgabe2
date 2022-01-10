package controller;

import model.Order;
import model.Product;

import java.util.List;

public interface IOrderController {

    Order addOrder(int orderNumber, String address, List<Product> productList);

    void updateOrder(int orderNumber, String address, List<Product> productList);

    List<Order> getAll();

    void deleteOrder(int orderNumber);
}
