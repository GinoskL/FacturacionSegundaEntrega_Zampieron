package com.example.facturacion.repositories;

import com.example.facturacion.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}
