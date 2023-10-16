package com.QuestionPro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.QuestionPro.Entity.GroceryItem;
import com.QuestionPro.Entity.Order;
import com.QuestionPro.Entity.OrderItem;
import com.QuestionPro.Service.UserService;

@RestController
@RequestMapping("/user/grocery")
public class UserController {
   @Autowired
   UserService service;
    
   @RequestMapping(value="/getAllItems", method = RequestMethod.GET)
   public List<GroceryItem> getAllItems(){
	   return service.getAllItems();
   }
   
   @RequestMapping(value="/placeOrder", method = RequestMethod.POST)
   public Order placeOrder(@RequestBody List<OrderItem> items) {
	   return service.placeOrder(items);
   }
   
}
