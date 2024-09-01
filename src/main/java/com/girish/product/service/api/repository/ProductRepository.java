package com.girish.product.service.api.repository;

import com.SpringProject.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String > {

}
