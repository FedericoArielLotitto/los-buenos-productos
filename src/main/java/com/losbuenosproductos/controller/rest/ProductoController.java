package com.losbuenosproductos.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ProductoController {

    @GetMapping("/redirect")
    public RedirectView proxyInverso() {
        RedirectView redirectView = new RedirectView("/ejemplo-redireccion");
        redirectView.setStatusCode(HttpStatus.FOUND);
        return redirectView;
    }
    
    @GetMapping("ejemplo-redireccion")
    public String redirigir() {
        return "ejemplo-redireccion";
    }
}
