package com.spring.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
		@Id
		private int id;
		private String product_Name;
	    private float product_price;
	    public String madein;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getProduct_Name() {
			return product_Name;
		}
		public void setProduct_Name(String product_Name) {
			this.product_Name = product_Name;
		}
		public float getProduct_price() {
			return product_price;
		}
		public void setProduct_price(float product_price) {
			this.product_price = product_price;
		}
		public String getMadein() {
			return madein;
		}
		public void setMadein(String madein) {
			this.madein = madein;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", product_Name=" + product_Name + ", product_price=" + product_price
					+ ", madein=" + madein + "]";
		}
	
	    
	    
	    

}
