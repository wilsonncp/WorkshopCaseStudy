import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pos {

	public void viewProducts() {
		
		ProductCatalog pc = new ProductCatalog();
		
		for (Product p : pc.getProducts()) {
			System.out.println(p.getSku() + ", price: " + p.getPrice());
		}
	}
	
	public void displayOrderSummary() {
		
	}
	
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 1;
        
        Pos mypos = new Pos();        
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
	        	break;
	        case 3:
	        	break;
	        default:
	        	break;
	        }
	        System.out.println("Goodbye");
        }
    } 
}
