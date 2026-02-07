package com.geraldine.Api_Inventario.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.geraldine.Api_Inventario.Entities.Producto;
import com.geraldine.Api_Inventario.Services.ProductoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoControlador {
    private final ProductoService productoService;
    @GetMapping
    public List<Producto>listar(){
        return productoService.listar();
    }
    @PostMapping
    public Producto crear(@RequestBody Producto producto){
        return productoService.createProducto(producto);
    }
}
