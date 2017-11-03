import java.util.*;

public class DiscountEngine {

	double[] multiItem (ArrayList<Product> ProductList) {
		double[] productPrices = new double[ProductList.size()];
		for (int i=0; i < ProductList.size(); i++) {
			double price = ProductList.get(i).getPrice();
			if (i % 2 == 1) {
			  price *= 0.7;
			}
			productPrices[i] = price;
		}
		return productPrices;
	}
	
	double[] bundling (ArrayList<Product> ProductList) {
		// Assume all items in ProductList is of same style
		double[] productPrices = new double[ProductList.size()];

		for (int i=0; i < ProductList.size(); i++) {
			if (ProductList.get(i).getStyle() == "WOM-SOC" && i != 0 && i % 2 == 0) {
				productPrices[i-2] = 0;
				productPrices[i-1] = 0;
				productPrices[i]   = 25;
			}
		}
		return productPrices;
	}
}
