package com.losbuenosproductos.controller.rest;

import com.losbuenosproductos.domain.Producto;
import com.losbuenosproductos.service.ProductoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ProductoRestController {

    private final ProductoService productoService;

    @GetMapping("/api/productos")
    public List<Producto> buscarTodos() {
        return productoService.buscarTodos();
    }

    @PostMapping("/api/productos/nuevo")
    public Producto crear(@RequestBody Producto producto) {
        return productoService.crear(producto);
    }

}
