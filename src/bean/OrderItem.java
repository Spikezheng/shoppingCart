package bean;

import bean.Product;
import bean.Order;

public class OrderItem {
	private int id;
	private Product product;
	private int num;
	private Order order;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public Order getOrder() {
		return this.order;
	}
}
