package com.losbuenosproductos.service;

import com.losbuenosproductos.domain.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> buscarTodos();
    Producto crear(Producto producto);
}
