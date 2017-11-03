import java.util.*;


public class CustomerPurchase {

	public CustomerPurchase()
	{
		products = new ArrayList<Product>(); 
	}
	
	public void addProduct(Product newProduct)
	{
		products.add(newProduct);
	}
	
	public ArrayList<Product> getProducts()
	{
		return products;
	}
	
	private ArrayList<Product> products;
}
