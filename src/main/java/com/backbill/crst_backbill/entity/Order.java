package com.backbill.crst_backbill.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"order\"", schema = "public")
public class Order {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;
	private String vendor_name;
	private int invoice_number;
	
	public Order() {
		
	}
	
	public Order(int order_id, String vendor_name, int invoice_number) {
		super();
		this.order_id = order_id;
		this.vendor_name = vendor_name;
		this.invoice_number = invoice_number;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public int getInvoice_number() {
		return invoice_number;
	}

	public void setInvoice_number(int invoice_number) {
		this.invoice_number = invoice_number;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", vendor_name=" + vendor_name + ", invoice_number=" + invoice_number
				+ "]";
	}
	
}
