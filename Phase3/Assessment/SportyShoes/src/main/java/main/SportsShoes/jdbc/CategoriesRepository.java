package main.SportsShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import main.SportsShoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
