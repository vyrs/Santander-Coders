package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		
		System.out.println("coloque o comprimento dos lados do triangulo x:");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		
		System.out.println("coloque o comprimento dos lados do triangulo y:");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area do Triangulo X: %.2f",areaX);
		System.out.println();
		System.out.printf("Area do Triangulo Y: %.2f",areaY);
		System.out.println();
		if(areaX > areaY) {
			System.out.println("o triangulo x é maior");
		} else {
			System.out.println("o triangulo y é maior");
		}
		
		sc.close();
	}

}
