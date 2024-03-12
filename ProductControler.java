package com.example.Product.Controler;
import org.springframework.web.bind.annotation.*;

import com.example.Product.Controler.service.ProductService;

@RestController
public class ProductControler {

    @GetMapping("/")
    public String getAllProduct() {
      ProductService ps = new ProductService();
      return ps.getAllProducts();

    }


    @GetMapping("/products/{id}/")
    public String getProductbyId(@PathVariable Long id) {
      ProductService ps = new ProductService();
      return ps.getProductivitybyId(id);
    }
}