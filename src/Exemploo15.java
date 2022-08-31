package teste;

import java.util.Scanner;

public class Exemploo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner ler = new Scanner (System.in);
		
	int a,b,c;
	
	System.out.printf("digitar a  ");
	a = ler.nextInt();
	System.out.printf("digitar b  ");
	b = ler.nextInt();
	System.out.printf("digitar c  ");
	c = ler.nextInt();
	
	
	if ( a == b && b == c) {
		System.out.printf(" Triângulo Equilátero");}
	else if (a!= b  & b == c|| b!= a & a == c || c!= b  & b == a) {
		System.out.printf("Triângulo Isóceles");
	}
	else if (a<( b+c) || b< (c+a) || c<(a+b)) {
		System.out.printf("Triângulo Escaleno");
		
	}
	else {
		System.out.printf("Não é um triângulo!");
	}
	}
}
