import java.util.ArrayList;

public class ProductCatalog {

	private ArrayList<Product> products;
	
	public ProductCatalog()
	{
		products = new ArrayList<Product>();
		
		products.add(new Product("AAA-BBB-RED-M", 10.00));
		products.add(new Product("AAA-BBB-RED-S", 10.00));
		products.add(new Product("AAA-BBB-BLU-M", 10.00));
		products.add(new Product("AAA-BBB-BLU-L", 10.00));
		
		products.add(new Product("ABB-CCC-GRE-L", 20.00));
		products.add(new Product("ABB-CCC-GRE-M", 20.00));
		products.add(new Product("ABB-CCC-RED-L", 20.00));
		products.add(new Product("AAA-BBB-RED-M", 20.00));
	}	

	public ArrayList<Product> getProducts()
	{
		return products;
	} 
	
	public void addProduct(Product product)
	{
		products.add(product);
	}
}

