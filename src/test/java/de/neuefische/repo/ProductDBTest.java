package de.neuefische.repo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDBTest {

    @Test
    @DisplayName("output of productlist")

    public void testList(){
        //Given
        ProductDB productDB = new ProductDB();

        //when
        String actual = productDB.list();
        //then
        String expected = "Schuhe, Jacke, Hose";

        assertEquals(expected,actual);
    }


}