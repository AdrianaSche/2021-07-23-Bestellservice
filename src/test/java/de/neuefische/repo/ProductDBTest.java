package de.neuefische.repo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDBTest {

    @Test
    @DisplayName("output of productlist")

    public void testListToList(){
        //Given
        ProductDB productDB = new ProductDB();

        //when
        String actual = productDB.listToString();
        //then
        String expected = "Schuhe, Jacke, Hose";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("test get whole product with ID and name")
    public void testGetProduct() {
        // GIVE
        ProductDB productList = new ProductDB();

        // WHEN
        String actual = productList.get(2);

        // THEN
        String expected = "2, Jacke";
        assertEquals(expected, actual);
    }


}