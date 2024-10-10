package com.example.ecommerce.controller;

import com.example.ecommerce.dao.IProductoDAO;
import com.example.ecommerce.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoDAO productoDAO;

    @PostMapping
    public void createProducto(@RequestBody Producto producto) {
        productoDAO.create(producto);
    }

    @GetMapping("/{id}")
    public Producto getProducto(@PathVariable Long id) {
        return productoDAO.read(id);
    }

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoDAO.readAll();
    }

    @PutMapping
    public void updateProducto(@RequestBody Producto producto) {
        productoDAO.update(producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        productoDAO.delete(id);
    }
}