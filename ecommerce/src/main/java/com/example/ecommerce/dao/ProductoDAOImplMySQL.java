package com.example.ecommerce.dao;

import com.example.ecommerce.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImplMySQL implements IProductoDAO{

    private List<Producto> productos = new ArrayList<>();

    @Override
    public void create(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto read(Long id) {
        return productos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Producto> readAll() {
        return productos;
    }

    @Override
    public void update(Producto producto) {
        Producto existing = read(producto.getId());
        if (existing != null) {
            existing.setDescripcion(producto.getDescripcion());
            existing.setPrecio(producto.getPrecio());
        }
    }

    @Override
    public void delete(Long id) {
        productos.removeIf(p -> p.getId().equals(id));
    }
}
