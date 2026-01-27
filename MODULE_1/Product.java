package MODULE_1;

public class Product {
	String pname, pcode;
	int price;
	
	public Product(){}
	
	public Product(String pname, String pcode, int price) {
		this.pname=pname;
		this.pcode= pcode;
		this.price=price;
	
	}
	
	public void Setpname(String pname) {
		this.pname= pname;
	}
	public String Getpname() {
		return this.pname;
	}
	public void Setpcode(String pcode) {
		this.pcode= pcode;
	}
	public String Getpcode() {
		return pcode;
	}
	public void  Setprice(int price) {
		this.price = price;
	}
	public String Getprice() {
		return pcode;
	}
	
	public void display() {
		System.out.println("pcode:"+ this.pcode);
		System.out.println("pname:"+ this.pname);
		System.out.println("price:"+ this.price);
		
	}
	
}
