package com.example.demo.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Product;

@Transactional
@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
