package main.SportsShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import main.SportsShoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
