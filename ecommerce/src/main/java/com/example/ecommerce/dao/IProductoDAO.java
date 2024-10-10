package com.example.ecommerce.dao;

import com.example.ecommerce.model.Producto;

import java.util.List;

public interface IProductoDAO {

    void create(Producto producto);
    Producto read(Long id);
    List<Producto> readAll();
    void update(Producto producto);
    void delete(Long id);

}
