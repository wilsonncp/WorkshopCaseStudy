import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Pos {

	public void viewProducts() {
		
		ProductCatalog pc = new ProductCatalog();
		
		for (Product p : pc.getProducts()) {
			System.out.println(p.getSku() + ", price: " + p.getPrice());
		}
	}
	
	public void displayOrderSummary(CustomerPurchase cp) { 
	
	}
	
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 1;
        
        Pos mypos = new Pos();        
        ProductCatalog pc = new ProductCatalog();
        CustomerPurchase cp = new CustomerPurchase();
        
        while (input != 0)
        {
	        System.out.println("1: View Products");
	        System.out.println("2: Add Product to Cart");
	        System.out.println("3: Checkout");
	        System.out.println("0: Quit");
	        System.out.println("Enter Option:");	        
	        try{
	            input = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
	        
	        switch (input)
	        {
	        case 1:
	        	mypos.viewProducts();
	        	break;
	        case 2:
	        	System.out.println("Enter Product Sku");	        	
	        	String sku = br.readLine();
	        	boolean found = false;
	    		for (Product p : pc.getProducts()) {
	    			if (p.getSku().equalsIgnoreCase(sku))
	    			{
	    				cp.addProduct(p);
	    				found = true;
	    				System.out.println("Added " +  p.getSku()); 
	    			}
	    		}
	    		if (!found)
	    		{
	    			System.out.println("Item " + sku + " not found in catalog");
	    		}	    	        
	        	break;
	        case 3: 
	        	mypos.displayOrderSummary(cp);
	        	break;
	        default:
	        	break;
	        }
        }
        System.out.println("Goodbye");
    } 
}
