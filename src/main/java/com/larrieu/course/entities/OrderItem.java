package com.larrieu.course.entities;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.larrieu.course.entities.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quantitity;
	private Double price;
	
	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantitity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantitity = quantitity;
		this.price = price;
	}
	
	//Esse get order chama o item associado, sem o jsonignore, havera um 
	//ciclo infinito de "bate e volta" entre o pedido e o produto.
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	public void setOrder(Order order) {
		id.setOrder(order);
	}

	public Product getProduct() {
		return id.getProduct();
	}
	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	public Integer getQuantitity() {
		return quantitity;
	}

	public void setQuantitity(Integer quantitity) {
		this.quantitity = quantitity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
}