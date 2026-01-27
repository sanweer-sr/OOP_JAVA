package MODULE_1;

public class ComplexNumber {
	
	double image, real ;
	
	ComplexNumber(double r, double i){
		real = r ; image = i;
	}
	
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
		ComplexNumber temp =new ComplexNumber(0,0);
		temp.real = c1.real+ c2.real;
		temp.image = c1.image+ c2.image;
		return temp;
		
	}
	

	public static void main(String[] arg) {
		ComplexNumber N1 =new ComplexNumber(5.4,4);
		ComplexNumber N2 =new ComplexNumber(1.2,3.5);
		ComplexNumber value = sum(N1, N2);
		System.out.println("Sum is :"+ value.real+ "+" + value.image + "i");
		
	}
}
