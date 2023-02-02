package com.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lead1")
public class lead 
{
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long ProductID;
		
		@Column(name="ProductName" , nullable=false, length=45)
		private String ProductName;
		
		@Column(name="ProductType" , nullable=false, length=45)
		private String ProductType;
		
		@Column(name="ProductCategory" , nullable=false, length=45)
		private String ProductCategory;
		
		@Column(name="ProductPrice" , nullable=false, length=45)
		private long ProductPrice;

		public long getProductID() {
			return ProductID;
		}
		public void setProductID(long productID) {
			ProductID = productID;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public String getProductType() {
			return ProductType;
		}
		public void setProductType(String productType) {
			ProductType = productType;
		}
		public String getProductCategory() {
			return ProductCategory;
		}
		public void setProductCategory(String productCategory) {
			ProductCategory = productCategory;
		}
		public long getProductPrice() {
			return ProductPrice;
		}
		public void setProductPrice(long productPrice) {
			ProductPrice = productPrice;
		}
}
