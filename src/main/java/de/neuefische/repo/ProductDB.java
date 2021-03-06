package de.neuefische.repo;

import de.neuefische.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDB {

    List<Product> productDB = new ArrayList<>();

    Product shoes = new Product(1,"Schuhe");
    Product jacket = new Product(2,"Jacke");
    Product pants = new Product(3,"Hose");

    public ProductDB() {
        productDB.add(shoes);
        productDB.add(jacket);
        productDB.add(pants);
    }

    public String list (){
        String result="";
        boolean isFirst = true;

        for (Product prod: productDB) {
            if(isFirst){
                isFirst = false;
                result += prod.getName();
            }else{
                result += ", " +prod.getName();
            }

        }return result;
    }

    public String get(int index) {

        String result = "";
        for (Product prod: productDB) {
            if (prod.getProductId() == index) {
                result += prod.getProductId() + ", " + prod.getName();
            }
        }
        return result;
    }



}

