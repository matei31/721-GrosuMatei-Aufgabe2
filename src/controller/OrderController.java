package controller;

import model.Order;
import model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class OrderController implements IOrderController{
    private final List<Order> orderList;
    private IProductController productController;

    public OrderController(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public Order addOrder(int orderNumber, String address, List<Product> productList){
        Order newOrder = new Order(orderNumber, address, productList);
        orderList.add(newOrder);
        return newOrder;
    }

    @Override
    public void updateOrder(int orderNumber, String address, List<Product> productList) {
        for(Order order: orderList){
            if(Objects.equals(order.getOrderNumber(), orderNumber)){
                order.setAddress(address);
                order.setProductList(productList);
            }
        }
    }

    @Override
    public List<Order> getAll() {
        return orderList;
    }

    @Override
    public void deleteOrder(int orderNumber) {
        orderList.removeIf(order -> Objects.equals(order.getOrderNumber(), orderNumber));
    }

    //3.
    public List<Map.Entry<Order, Integer>> sortByTotalPrice() {
        Map<Order, Integer> orderMap = new HashMap<>();
        for(Order order : orderList)
            for (Product product: order.getProductList()){
                orderMap.put(order, orderMap.get(order) + product.getPreis());
            }

        return orderMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList();
    }

    //4.
    public List<Order> filterByProduct (Product product) {
        return orderList.stream().filter(order -> order.getProductList().contains(product)).collect(Collectors.toList());
    }



}
