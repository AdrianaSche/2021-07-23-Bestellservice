package de.neuefische.repo;

import de.neuefische.model.Order;
import de.neuefische.model.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderDBTest {

    @Test
    @DisplayName("output of orderlist")

    public void testListToString(){
        //Given
        OrderDB orderDB = new OrderDB();

        //when
        String actual = orderDB.listToString();
        //then
        String expected = "OID: 10 PID:1 P:Schuhe, OID: 11 PID:1 P:Schuhe, OID: 12 PID:3 P:Hose";
        assertEquals(expected,actual);
    }

    @Test
    public void testList(){
        //Given
        OrderDB orderDB = new OrderDB();

        //when
        List<Order> actual = orderDB.list();
        //then
        String expected = ;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("test get whole order ID, PID, product name")
    public void testGetProduct() {
        // GIVE
        OrderDB orderList = new OrderDB();

        // WHEN
        String actual = orderList.get(11);

        // THEN
        String expected = "11 1 Schuhe";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("test if order is added")
    public void tesAdd(){
        //given
        OrderDB orderList = new OrderDB();
        Order order = new Order(13,new Product(4,"Hut"));


        //when
        orderList.add(order);
        String actual =orderList.get(13);
        //then
        String expected ="13 4 Hut";
        assertEquals(expected,actual);

    }

}