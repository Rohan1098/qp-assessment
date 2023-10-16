package com.QuestionProRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QuestionPro.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
