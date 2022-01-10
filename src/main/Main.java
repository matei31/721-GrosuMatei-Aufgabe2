package main;

import controller.IOrderController;
import controller.IProductController;
import controller.OrderController;
import controller.ProductController;
import view.View;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        IProductController productController = new ProductController(new ArrayList<>());
        IOrderController orderController = new OrderController(new ArrayList<>());
        View view = new View(orderController, productController);
        view.run();
    }
}
