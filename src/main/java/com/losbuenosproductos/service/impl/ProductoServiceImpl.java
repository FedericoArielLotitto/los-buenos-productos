package com.losbuenosproductos.service.impl;

import com.losbuenosproductos.domain.Producto;
import com.losbuenosproductos.repository.ProductoRepository;
import com.losbuenosproductos.service.ProductoService;
import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;

    @Override
    public List<Producto> buscarTodos() {
        return productoRepository.findAll();
    }
}
