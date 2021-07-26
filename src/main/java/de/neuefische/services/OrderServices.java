package de.neuefische.services;

import de.neuefische.model.Order;
import de.neuefische.model.Product;
import de.neuefische.repo.OrderDB;
import de.neuefische.repo.ProductDB;

import java.util.ArrayList;
import java.util.List;

public class OrderServices {

    OrderDB orderDB = new OrderDB();
    ProductDB productDB = new ProductDB();


    public void addOrder(Product newProduct) {

        //if newProduct in ProductBD {
            //convert newProduct to newOrder
                //add newOrder to OrderBD
/*        for (Product prod: productDB.listToString()) {
            if(newProduct.getName().equals(prod.getName())) {
                Order newOrder = new Order(1, newProduct);
            }*/
        }


/*    public List<Order> listOrders() {
        return ;
    }*/

}
