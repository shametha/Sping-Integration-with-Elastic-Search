package com.example.demoelastic.controller;

import com.example.demoelastic.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demoelastic.repository.ProductRepository;

import java.util.List;


@RestController
@RequestMapping(value = "/search")
public class ProductController {

    @Autowired
    ProductRepository productRepository;


    @PostMapping(value = "/save/list")
    public int saveListOfProduct(@RequestBody List<Product> productList)
    {
        productRepository.saveAll(productList);
        return productList.size();
    }

    @PostMapping(value = "/save")
    public Product saveProduct(@RequestBody Product product)
    {
        return productRepository.save(product);
    }

    @GetMapping(value = "/findall")
    public Iterable<Product> findAll()
    {
        return productRepository.findAll();
    }

    @GetMapping(value = "/findall/{productName}")
    public List<Product> findByProductName(@PathVariable("productName") String productName)
    {
        return productRepository.findByProductName(productName);
    }

    @DeleteMapping(value = "deleteall")
    public void deleteAll()
    {
        productRepository.deleteAll();
    }

}