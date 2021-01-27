package vn.codegym.product.service;


import vn.codegym.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(Long id);

    void save(Product product);

}
