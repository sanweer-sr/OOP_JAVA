package MODULE_1;

public class Cars {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode="car1";
		p1.price=100000;
		p1.pname="Benz";
		System.out.println("\nDisplay P1:");
		p1.display();
		
		Product p2 = new Product("Jaguar","car2",50000);
		System.out.println("\nDisplay P2:");
		p2.display();
		
		Product p3 = new Product("Maruthi","car3",25000);
		System.out.println("\nDisplay P3:");
		p2.display();
		
		Product p= p3.price<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying Product with Lowest Price:");
		p.display();
	}

}
