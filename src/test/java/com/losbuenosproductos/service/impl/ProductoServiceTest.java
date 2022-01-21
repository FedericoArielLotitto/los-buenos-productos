package com.losbuenosproductos.service.impl;

import com.losbuenosproductos.builder.ProductoBuilder;
import com.losbuenosproductos.domain.Producto;
import com.losbuenosproductos.service.ProductoService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class ProductoServiceTest {
    @Autowired
    ProductoService productoService;
    
    @Autowired
    EntityManager entityManager;
    
    @Test
    public void buscarTodos_conProductosExistentes_retornaProductos() {
        ProductoBuilder.completo().conNumeroDeSerie("14561278653456762578").build(entityManager);
        
        List<Producto> productos = productoService.buscarTodos();
        
        assertThat(productos).isNotEmpty().hasSize(1);
    }
    
    @Test
    public void buscarTodos_sinProductosExistentes_noRetornaProductos() {
        List<Producto> productos = productoService.buscarTodos();
        
        assertThat(productos).isEmpty();
    }
}
