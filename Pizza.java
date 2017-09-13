public class Pizza {
	
	String PhoneNumber;
	String Size;
	String Sauce;
	String Crust;
	String Toppings;
	String Extras;
	Double Price = 0.00;
	
	Pizza() {
		
		 PhoneNumber = " ";
		 Size = " ";
		 Sauce = " ";
		 Crust = " ";
		 Toppings = " ";
		 Extras = " ";
	
	}
	
	void setPrice(double price)
	{
		Price = Price + price;
	}
	
	void setPhoneNumber(String number)
	{
		PhoneNumber = number;
	}
	
	void setSize(String size)
	{
		Size = size;
	}
	
	void setSauce(String sauce)
	{
		Sauce = sauce;
	}
	
	void setCrust(String crust)
	{
		Crust = crust;
	}
	
	void setToppings(String toppings)
	{
		Toppings = Toppings + toppings + " ";
	}
	
	void setExtras(String extras)
	{
		Extras = Extras + extras + " ";
	}
	
	String getPizza()
	{
		return (PhoneNumber + "\n" +Size + "\n" + Sauce + "\n" + Crust + "\n" + Toppings + "\n" + Extras + "\n");
		
	}
	
	double getPrice()
	{
		return Price;
	}
	
	void clearPizza()
	{
		Toppings = " ";
		PhoneNumber = " ";
		Size = " ";
		Sauce = " ";
		Crust = " ";
		Extras = " ";
	}

}
