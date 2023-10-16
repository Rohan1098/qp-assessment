package com.QuestionProRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QuestionPro.Entity.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {

}
