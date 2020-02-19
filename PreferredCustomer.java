
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
		if(purchases <= 500)
			discountLevel = 0.05;
		else if(purchases <= 1000)
			discountLevel = 0.06;
		else if(purchases <= 1500)
			discountLevel = 0.07;
		else 
			discountLevel = 0.1;
	
		return discountLevel;
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
