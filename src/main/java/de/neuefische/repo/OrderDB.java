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
        return " ";
    }


    public String get(int i) {
        return " ";
    }
}
