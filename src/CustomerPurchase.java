import java.util.*;


public class CustomerPurchase {

	public CustomerPurchase()
	{
		products =  new HashMap<String, Product>(); 
	}
	
	public void addProduct(Product newProduct)
	{
		products.put(newProduct.getStyle(), newProduct);
	}
	
	public HashMap<String, Product> getProducts()
	{
		return products;
	}
	
	HashMap<String, Product> products;
}
