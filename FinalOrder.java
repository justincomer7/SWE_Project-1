
public class FinalOrder {
	
	String Order;
	double Price;
	
	void setNumber(String number)
	{
		Order = number + "\n";
	}
	
	void setOrder(String order)
	{
		Order = Order + " " + order;
	}
	
	void setNewPrice(double price)
	{
		Price = Price + price;
	}
	
	String getOrder()
	{
		return Order;
	}
	
	double getPrice()
	{
		return Price;
	}

}
