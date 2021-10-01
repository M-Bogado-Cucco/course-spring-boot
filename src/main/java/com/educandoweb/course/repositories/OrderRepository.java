package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{//ao herdar do JPA, automaticamente o
														//OrderRepository vira componente(@Repository) do Spring
}
