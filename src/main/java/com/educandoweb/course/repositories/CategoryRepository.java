package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{//ao herdar do JPA, automaticamente o
														//UserRepository vira componente(@Repository) do Spring
}
