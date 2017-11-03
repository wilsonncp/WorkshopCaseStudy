
public class Pos {

	public void viewProducts() {
		
		ProductCatalog pc = new ProductCatalog();
		
		for (Product p : pc.getProducts()) {
			System.out.print(p.getSku() + ", price: " + p.getPrice());
		}
	}
	
	public void displayOrderSummary() {
		
	}
}
