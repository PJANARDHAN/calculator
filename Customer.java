package Product_Car;

public class Customer {

	String Name;
	int  MobileNo;
	Car car;


	public Customer(String name, int mobileNo, Car car) {
		super();
		Name = name;
		MobileNo = mobileNo;
		this.car = car;
	}
	
	
	public void CustomerDetails() 
	{
		System.out.println("customer name : "+ Name);
		System.out.println("customer mobilenumber : "+ MobileNo);
		car.CarDetails();
	}
	
	
}
