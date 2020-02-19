
public class Person
{
	private String name;
	private String address;
	private String phone;
	
	public Person()
	{
		// Calls public Person(String n, String a, String p) constructor
		this("Darren Lim", "Ellicott Lane", "609540047");
	}
	public Person(String n, String a, String p)
	{
		name = n;
		address = a;
		phone = p;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setAddress(String a)
	{
		address = a;
	}
	public void setPhone(String p)
	{
		phone = p;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	
}
