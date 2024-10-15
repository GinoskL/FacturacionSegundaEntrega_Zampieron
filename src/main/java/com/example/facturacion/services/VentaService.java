package com.example.facturacion.services;

import com.example.facturacion.models.Venta;
import com.example.facturacion.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    public Venta getVentaById(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    public Venta saveVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public void deleteVenta(Long id) {
        ventaRepository.deleteById(id);
    }
}
