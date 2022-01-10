package controller;

import model.Order;
import model.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {


    @Test
    void sortByTotalPrice(){
        ProductController productController = new ProductController(new ArrayList<>());
        OrderController orderController = new OrderController(new ArrayList<>());

        Product p1 = new Product("Milk", 2);
        Product p2 = new Product("Bread", 1);

        productController.addProduct("Milk", 2);
        productController.addProduct("Bread", 1);

        ArrayList<Product> list1 = new ArrayList<Product>();
        list1.add(p1);
        orderController.addOrder(1, "AAA", list1);

        ArrayList<Product> list2 = new ArrayList<Product>();
        list2.add(p2);
        orderController.addOrder(2, "BBB", list2);

        List<Map.Entry<Order, Integer>> topOrders = orderController.sortByTotalPrice();
        assertEquals(2, topOrders.get(0).getValue());
        assertEquals(1, topOrders.get(0).getValue());
    }

    @Test
    void filterByProduct(){
        ProductController productController = new ProductController(new ArrayList<>());
        OrderController orderController = new OrderController(new ArrayList<>());

        Product p1 = new Product("Milk", 2);
        Product p2 = new Product("Bread", 1);

        productController.addProduct("Milk", 2);
        productController.addProduct("Bread", 1);

        ArrayList<Product> list1 = new ArrayList<Product>();
        list1.add(p1);
        list1.add(p2);
        orderController.addOrder(1, "AAA", list1);

        assertEquals(1, orderController.filterByProduct(p1).get(0).getOrderNumber());

    }



}