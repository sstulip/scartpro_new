package com.sample.scartpro.controller;

import com.sample.scartpro.model.Product;
import com.sample.scartpro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
   @Autowired
   ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Product>addProductDetails(@RequestBody Product products){
        productService.productServiceDetails(products);
        return new ResponseEntity<Product>(products, HttpStatus.OK);
    }
}
