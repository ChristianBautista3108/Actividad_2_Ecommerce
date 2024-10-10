package com.example.ecommerce.dao;

import com.example.ecommerce.model.Producto;
import org.apache.tomcat.util.digester.Digester;
import org.apache.tomcat.util.digester.ObjectCreateRule;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("Oracle")
public class ProductoDAOImplOracle implements IProductoDAO {

    private Map<Long, Producto> productos = new HashMap<>();

    @Override
    public void create(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public Producto read(Long id) {
        return productos.get(id);
    }

    @Override
    public List<Producto> readAll() {
        return new ArrayList<>(productos.values());
    }

    @Override
    public void update(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void delete(Long id) {
        productos.remove(id);
    }
}
