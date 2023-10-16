package com.QuestionPro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuestionPro.Entity.GroceryItem;
import com.QuestionPro.Entity.Order;
import com.QuestionPro.Entity.OrderItem;
import com.QuestionProRepository.GroceryItemRepository;
import com.QuestionProRepository.OrderRepository;

@Service
public class UserService {
   
	@Autowired
	GroceryItemRepository groceryItemRepository;
	@Autowired
    OrderRepository orderRepository;
	
	public List<GroceryItem> getAllItems(){
		return groceryItemRepository.findAll();
	}
	
	public Order placeOrder(List<OrderItem> items) {
        double totalPrice=0.0;
        for(OrderItem x: items) {
        	totalPrice=totalPrice + (x.getItem().getPrice() * x.getQuantity());    			
        }
        Order order=new Order((long) 101, items);
        System.out.println("Your total is = "+totalPrice);
        return orderRepository.save(order);
    }
	
}
