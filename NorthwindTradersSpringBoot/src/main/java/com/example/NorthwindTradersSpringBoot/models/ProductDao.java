package com.example.NorthwindTradersSpringBoot.models;

import java.util.List;

public interface ProductDao {
//    List<Product> getAll()
//    Product getById(int id)

    void add(Product product);

    List<Product> getAll();
}
