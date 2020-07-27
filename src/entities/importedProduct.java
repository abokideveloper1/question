package entities;
import entities.product;
import application.mainClass;

public class importedProduct extends product{
	
	private Double customFee;

	public importedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		
		return getPrice() + customFee;
		
	}
	
	@Override
	public String priceTag() {
		
		return getName()
		
		+ "+"
		+String.format("%.2f",totalPrice())
		+"(Custom's fee: $ "
		+String.format("%.2f",customFee)
		+")";
	}
	

}
