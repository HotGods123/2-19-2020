
public class PreferredCustomer extends Customer
{
	private double purchases;
	private double discountLevel;
	
	public PreferredCustomer()
	{
		super();
		purchases = 1750;
	}
	public PreferredCustomer(String n, String a, String p, String c, boolean m, double pur)
	{
		super(n,a,p,c,m);
		purchases = pur;
	}
	public void setPurchases(double p)
	{
		purchases = p;
	}
	public double getPurchases()
	{
		return purchases;
	}
	public double getDiscountLevel()
	{
		double discount = 0;
		if(purchases <= 500)
			discount = 0.5;
		else if(purchases <= 1000)
			discount = 0.6;
		else if(purchases <= 1500)
			discount = 0.7;
		else 
			discount = 1.0;
	
		return discount;
	}


public static void main(String[] args)
{
	PreferredCustomer guest = new PreferredCustomer();
	Customer person = new Customer();
	Person customer = new Person();
	System.out.println("Name: " + customer.getName());
	System.out.println("Address: " + customer.getAddress());
	System.out.println("Telephone: " + customer.getPhone());
	System.out.println("Customer Number: " + person.getCustomerNumber());
	if(person.getMailingList())
		System.out.println("Mailing List: YES");
	else 
		System.out.println("Mailing List: NO");
	System.out.println("Purchases: " + guest.getPurchases());
	System.out.println("Discount Level: " + guest.getDiscountLevel());
}

}