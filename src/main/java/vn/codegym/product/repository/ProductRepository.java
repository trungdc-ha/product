package vn.codegym.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.product.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
