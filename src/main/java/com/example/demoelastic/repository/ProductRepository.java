package com.example.demoelastic.repository;

import com.example.demoelastic.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product,String> {

    public List<Product> findByProductName(String productName);

}
