package com.neeraj.product.controller;

import com.neeraj.product.model.Product;
import com.neeraj.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping(value = "/get")
    @ResponseStatus(HttpStatus.OK)
    private List<Product> findAll(){
        return productRepository.findAll();
    }

    @PostMapping(value = "/saveAll")
    @ResponseStatus(HttpStatus.CREATED)
    private List<Product> saveAll(@RequestBody List<Product> products){
        return productRepository.saveAll(products);
    }
    @PostMapping(value = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    private Product saveAll(@RequestBody Product product){
        return productRepository.save(product);
    }
}
