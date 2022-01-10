package view;

import controller.IOrderController;
import controller.IProductController;

import java.util.Scanner;

public class View {
    private IOrderController orderController;
    private IProductController productController;

    public View(IOrderController orderController, IProductController productController) {
        this.orderController = orderController;
        this.productController = productController;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Show all Products \r
                     2. Show all Orders \r
                     3. Add a Product \r
                     4. Add an Order \r
                     5. Remove a product \r
                     6. Remove an order \r
                     7. Update a product \r
                     8. Update an order \r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    showProducts();
                    break;
                case 2:
                    showOrders();
                    break;
                case 3:
                    addProduct();
                    break;
                case 4:
                    addOrder();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 6:
                    deleteOrder();
                    break;
                case 7:
                    updateProduct();
                    break;
                case 8:
                    updateOrder();
                    break;
            }

        }
    }

    private void showOrders() {
    }

    private void showProducts() {
    }

    private void addProduct() {
    }

    private void addOrder() {
    }

    private void deleteProduct() {
    }

    private void deleteOrder() {
    }

    private void updateProduct() {
    }

    private void updateOrder() {
    }
}
