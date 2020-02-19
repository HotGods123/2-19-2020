
public class Customer extends Person
{
	private String customerNumber;
	private boolean mailingList;
	
	public Customer()
	{
		super();
		customerNumber = "12345";
		mailingList = false;
	}
	public Customer(String n, String a, String p, String c, boolean m)
	{
		super(n, a, p);
		customerNumber = c;
		mailingList = m;
	}
	public void setCustomerNumber(String c)
	{
		customerNumber = c;
	}
	public void setMailingList(boolean m)
	{
		mailingList = m;
	}
	public String getCustomerNumber()
	{
		return customerNumber;
	}
	public boolean getMailingList()
	{
		// Short form of
		/*
			if(mailingList)
				return "TRUE";
			else
				return "FALSE";
		*/
		return mailingList ? "TRUE" : "FALSE";
	}

	public static void main(String[] args)
	{
		Customer person = new Customer();
		Person customer = new Person();
		System.out.println("Name: " + customer.getName());
		System.out.println("Address: " + customer.getAddress());
		System.out.println("Telephone: " + customer.getPhone());
		System.out.println("Customer Number: " + person.getCustomerNumber());
		System.out.println("Mailing List: " + person.getMailingList());
	}
}
