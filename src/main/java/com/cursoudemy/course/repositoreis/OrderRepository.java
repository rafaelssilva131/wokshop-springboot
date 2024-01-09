package com.cursoudemy.course.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
