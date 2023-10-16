package com.QuestionPro.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import java.util.List;

import javax.persistence.*;

@Entity
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<OrderItem> items;
	public Order(Long id, List<OrderItem> items) {
		super();
		this.id = id;
		this.items = items;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", items=" + items + "]";
	}
    
    
    
}
