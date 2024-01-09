package com.cursoudemy.course.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
