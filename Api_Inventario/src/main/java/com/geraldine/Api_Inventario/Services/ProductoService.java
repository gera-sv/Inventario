package com.geraldine.Api_Inventario.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geraldine.Api_Inventario.Entities.Producto;
import com.geraldine.Api_Inventario.Repositories.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public List<Producto> listar() {
        return productoRepository.findAll();
    }
    public Producto creaProducto(Producto producto){
        return productoRepository.save(producto);
    }


}
