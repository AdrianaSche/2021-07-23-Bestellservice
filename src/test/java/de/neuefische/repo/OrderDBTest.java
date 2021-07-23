package de.neuefische.repo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderDBTest {

    @Test
    @DisplayName("output of orderlist")

    public void testList(){
        //Given
        OrderDB orderDB = new OrderDB();

        //when
        String actual = orderDB.list();
        //then
        String expected = "OID: 10 PID:1 P:Schuhe, OID: 11 PID:1 P:Schuhe, OID: 12 PID:3 P:Hose";
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

}