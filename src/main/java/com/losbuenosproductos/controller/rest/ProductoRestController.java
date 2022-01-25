package com.losbuenosproductos.controller.rest;

import com.losbuenosproductos.domain.Producto;
import com.losbuenosproductos.service.ProductoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

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

    @GetMapping("/redirect")
    public RedirectView proxyInverso() {
        RedirectView redirectView = new RedirectView("https://burbujas.flotitto.dev.somospnt.com");
        redirectView.setStatusCode(HttpStatus.MOVED_PERMANENTLY);
        return redirectView;
    }
}
