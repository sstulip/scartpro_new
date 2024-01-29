package com.sample.scartpro.service;

import com.sample.scartpro.model.Product;
import com.sample.scartpro.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public ResponseEntity<Product> productServiceDetails(@RequestBody Product products){
            productRepo.save(products);
             return new ResponseEntity<Product>(products, HttpStatus.OK);

    }
}
