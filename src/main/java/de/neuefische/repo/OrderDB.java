package de.neuefische.repo;


import de.neuefische.model.Order;
import de.neuefische.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDB {

    List<Order> orderList = new ArrayList<>();

    public OrderDB() {
        orderList.add(new Order(10, new Product(1, "Schuhe")));
        orderList.add(new Order(11, new Product(1, "Schuhe")));
        orderList.add(new Order(12, new Product(3, "Hose")));
    }

    public String list() {
        String result = "";
        boolean firstEntry = true;
        for (Order ord : orderList) {
            if(firstEntry) {
                firstEntry = false;
                result += "OID: " + ord.getOrderId() + " PID:" + ord.getProduct().getProductId() + " P:" +ord.getProduct().getName();
            } else {
                result += ", OID: " + ord.getOrderId() + " PID:" + ord.getProduct().getProductId() + " P:" +ord.getProduct().getName();
            }
        }
        return result;
    }




    public String get(int index) {

        String result = "";
        for (Order ord: orderList) {
            if (ord.getOrderId() == index) {
                result += ord.getOrderId() + " " + ord.getProduct().getProductId() + " " + ord.getProduct().getName();
            }
        }
        return result;
    }


    public void add(Order order) {
        orderList.add(order);
    }
}
