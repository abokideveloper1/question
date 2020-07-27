package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.product;
import entities.importedProduct;
import entities.usedProduct;

public class mainClass {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.UK);
		SimpleDateFormat dateinput = new SimpleDateFormat("dd/mm/yyyy");
		List<product> productlist = new ArrayList<>();
		
		System.out.print("Input number of products: \n");
		int productCounting = input.nextInt();
		
		for (int i = 1;i < productCounting; i++) {
			System.out.print("Is this product imported,used or national? (i/u/n): \n");
			char producttype = input.next().charAt(0);
			System.out.print("Input product # " + i + " data: \n");
			System.out.print("Input product name: \n");
			String name = input.nextLine();
			input.next();
			System.out.print("Input product price: \n");
			Double price = input.nextDouble();
			
			if (producttype == 'n') {
				
				productlist.add(new product(name,price));
				
			}
			
			else if (producttype == 'i') {
				
				System.out.print("Input product # " + i + " data: \n");
				System.out.print("Input product name: \n");
				 name = input.nextLine();
				 input.next();
				 System.out.print("Input product price: \n");
				 price = input.nextDouble();
				 System.out.print("Input product import fee: \n");
				  double productfee = input.nextDouble();
				 productlist.add(new importedProduct(name,price,productfee));
				
			}
			else if (producttype == 'u') {
				
				System.out.print("Input product # " + i + " data: \n");
				System.out.print("Input product name: \n");
				 name = input.nextLine();
				 input.next();
				 System.out.print("Input product price: \n");
				 price = input.nextDouble();
				 System.out.print("Input product manufacture date (DD/MM/YYYY): \n");
				 Date manufactureDate = new Date();
				 productlist.add(new usedProduct(name,price,manufactureDate));
				
			}
			
			
		}
		
		System.out.print(" \n");
		for (product output:productlist) {
			
			System.out.print(output.priceTag());
			
		}

	}

}
