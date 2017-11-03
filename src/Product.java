
public class Product {

	private String sku;
	private double price;
	
	public Product(String sku, double d)
	{
		this.sku = sku;
		this.price = d;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	} 
	
	public String getStyle()
	{
		return sku.substring(0, 6);
	}
}
