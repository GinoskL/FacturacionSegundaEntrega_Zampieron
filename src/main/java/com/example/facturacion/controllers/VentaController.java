package com.example.facturacion.controllers;

import com.example.facturacion.models.Venta;
import com.example.facturacion.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> getAllVentas() {
        return ventaService.getAllVentas();
    }

    @GetMapping("/{id}")
    public Venta getVentaById(@PathVariable Long id) {
        return ventaService.getVentaById(id);
    }

    @PostMapping
    public Venta saveVenta(@RequestBody Venta venta) {
        return ventaService.saveVenta(venta);
    }

    @DeleteMapping("/{id}")
    public void deleteVenta(@PathVariable Long id) {
        ventaService.deleteVenta(id);
    }
}
