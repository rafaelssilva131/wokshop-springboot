package com.cursoudemy.course.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.course.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
