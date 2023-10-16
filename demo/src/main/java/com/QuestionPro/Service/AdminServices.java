package com.QuestionPro.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuestionPro.Entity.GroceryItem;
import com.QuestionProRepository.GroceryItemRepository;

@Service
public class AdminServices {
	
	@Autowired
	GroceryItemRepository groceryItemRepository;
	
	public List<GroceryItem> getAllItems(){
		return groceryItemRepository.findAll();
	}
	public void addGrocery(GroceryItem groceryItem) {
		if(groceryItem !=null) {
			groceryItemRepository.save(groceryItem);
		}
	}
	
	public void deleteGrocery(Long id) {
		if(groceryItemRepository.findById(id) !=null){
			GroceryItem gi=  groceryItemRepository.findById(id).get();
			groceryItemRepository.delete(gi);
		}
	}
	
	public void updateGrocery(GroceryItem groceryItem) {
		if(groceryItemRepository.findById(groceryItem.getId()) !=null){
			groceryItemRepository.delete(groceryItem);
		}
	}
	
}
