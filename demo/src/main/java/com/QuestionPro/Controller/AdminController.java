package com.QuestionPro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.QuestionPro.Entity.GroceryItem;
import com.QuestionPro.Service.AdminServices;

@RestController
@RequestMapping("/admin/grocery")
public class AdminController {
  @Autowired
  AdminServices adminServices;
  
  @RequestMapping(value="/getAllItems", method = RequestMethod.GET)
  public List<GroceryItem> getAllItems() {
	  return adminServices.getAllItems();
  }
  
  @RequestMapping(value="/addItem",method = RequestMethod.POST)
  public void addGrocery(@RequestBody GroceryItem groceryItem) {
	  adminServices.addGrocery(groceryItem);
  }
  
  @RequestMapping(value="/deleteItem/{id}",method = RequestMethod.DELETE)
  public void deleteGrocery(@PathVariable("id") Long id) {
	  adminServices.deleteGrocery(id);
  }
  
  @RequestMapping(value="/updateItem",method = RequestMethod.PUT)
  public void updateGrocery(@RequestBody GroceryItem groceryItem) {
	  adminServices.updateGrocery(groceryItem);
  }
  
}
