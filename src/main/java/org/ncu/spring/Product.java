package org.ncu.spring;

public class Product 
{
	String name;
		int id,quantity;
		double price;
		public Product() 
		{
			super();
		}
		public Product(String name, int id, int quantity, double price) {
			super();
			this.name = name;
			this.id = id;
			this.quantity = quantity;
			this.price = price;
		}


		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) 
		{
			this.price = price;
		}
				
		

}
