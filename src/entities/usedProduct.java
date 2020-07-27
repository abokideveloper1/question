package entities;
import java.util.Date;
import java.text.SimpleDateFormat;
public class usedProduct extends product{
	
	private static final SimpleDateFormat dateinput = new SimpleDateFormat("dd/mm/yyyy");
	Date manufactureDate = new Date();
	
	public usedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public static SimpleDateFormat getDateinput() {
		return dateinput;
	}
	
	public String priceTag() {
		
		return getName();
		
	}
	
	

}
