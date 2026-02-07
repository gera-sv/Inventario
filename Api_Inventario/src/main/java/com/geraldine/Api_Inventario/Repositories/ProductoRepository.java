package com.geraldine.Api_Inventario.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geraldine.Api_Inventario.Entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
