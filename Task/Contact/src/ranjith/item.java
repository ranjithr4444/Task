package ranjith;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="item")
@Table(name="Item")
public class item {
    
private int productid;

	private String productname;
	private String Quanity;
	private double price;
	private String manufacturing_date;
	@Column(name="Man_Date")
	private String expri_date;
	public int getProductid() {
		return productid;
	}
	public  void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getQuanity() {
		return Quanity;
	}
	public void setQuanity(String quanity) {
		Quanity = quanity;
	}
	public double gtPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturing_date() {
		return manufacturing_date;
	}
	public void setManufacturing_date(String manufacturing_date) {
		this.manufacturing_date = manufacturing_date;
	}
	public String getExpri_date() {
		return expri_date;
	}
	public void setExpri_date(String expri_date) {
		this.expri_date = expri_date;
	}
	@Override
	public String toString() {
		return "Item [id=" + productid + ", name=" + productname + ", qunatity=" + Quanity +", price=" + price
				+ ", manufacturingDate=" + manufacturing_date + ", expri_date" + expri_date +"]";
	}
	
	

}