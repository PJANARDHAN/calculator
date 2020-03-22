package Product_Car;

public class Manager {

	public static void main(String[] args) {

		Car car1 = new Car("I20", "hondai", 100000, "petrol");
		Car car2 = new Car("I20", "hondai", 2000, "disel");
		Car car3 = new Car("I20", "BMW", 450000, "petrol");
		Car car4 = new Car("I20", "hondai", 1030, "disel");

		Customer c1 = new Customer("Rajesh", 123445, car1);
		Customer c2 = new Customer("Manju", 445321, car3);
		Customer c3 = new Customer("Kiran", 128754, car2);
		Customer c4 = new Customer("Sunil", 1644739, car4);
		int index = 0;

		Customer arr[] = { c1, c2, c3, c4 };
		int max = arr[0].car.price;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].car.price > max) {
				max = arr[i].car.price;
				index = i;
			}
			arr[i].CustomerDetails();
			System.out.println("-------------------------------------");
		}
		System.out.println("maximum price is :" + max);
		arr[index].CustomerDetails();
		System.out.println("-------------------------------------");

		double pMax = arr[0].car.price, dMax = arr[0].car.price;
		int p = 0, d = 0;
		;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].car.fuel.equals("petrol")) {
				if (arr[i].car.price > pMax) {
					pMax = arr[i].car.price;
					p = i;
				}
			} else {
				if (arr[i].car.price > dMax) {
					dMax = arr[i].car.price;
					d = i;
				}
			}
		}

		System.out.println("Max Petrol owner car");
		arr[p].CustomerDetails();
		System.out.println("-------------------------------------");
		System.out.println("Max disel owner car");
		arr[d].CustomerDetails();

	}

}
