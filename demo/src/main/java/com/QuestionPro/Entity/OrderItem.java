package com.QuestionPro.Entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class OrderItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private GroceryItem item;
    private int quantity;
    
    
	public OrderItem(Long id, GroceryItem item, int quantity) {
		super();
		this.id = id;
		this.item = item;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public GroceryItem getItem() {
		return item;
	}
	public void setItem(GroceryItem item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", item=" + item + ", quantity=" + quantity + "]";
	}
    
    
}
