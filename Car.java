package Product_Car;

public class Car {
	String model;
	String manufacture;
	int price;
	String fuel;
	

	public Car(String model, String manufacture, int price, String fuel) {
		super();
		this.model = model;
		this.manufacture = manufacture;
		this.price = price;
		this.fuel = fuel;
	}
	
	public void CarDetails() 
	{
		System.out.println("car model : "+ model);
		System.out.println("car manufacture : "+ manufacture);
		System.out.println("car price : "+ price);
		System.out.println("car fuel : "+ fuel);
	}
}
