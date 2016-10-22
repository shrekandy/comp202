package winter2015;

public class A1PB {

	public static void main(String[] args) {
	
		double radius = Double.parseDouble(args[0]);
		double lanes = Double.parseDouble(args[1]);
		double totalArea = Math.pow(radius,2)*Math.PI - Math.PI * Math.pow(radius-(2.8*lanes), 2);
		double subTotal = 7.49 * totalArea;
		double salesTax = subTotal * 0.15;
		double Total = subTotal + salesTax;
		System.out.println("Total Area: " + totalArea);
		System.out.println("Subtotal: "+ subTotal + "$");
		System.out.println("Sales Tax (15%): " + salesTax);
		System.out.println("Total: " + Math.ceil(Total));
		//methods like Math.ceil or Math.pow etc. with capital letters in the beginning are methods already installed and done by Java
		//so you don't have to write explanations for the methods below
	}
}
