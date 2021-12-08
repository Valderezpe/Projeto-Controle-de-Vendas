package com.valderezpe.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valderezpe.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
