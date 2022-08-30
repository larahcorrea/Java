package teste;

import java.util.Scanner;

public class Exemploo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner (System.in);
		
double peso,altura,imc;
String fem, masc, sexo;	


System.out.printf("digitar peso  ");
peso = ler.nextDouble();

System.out.printf("digitar altura  ");
altura= ler.nextDouble();

System.out.printf("digitar sexo ");
sexo= ler.nextLine();
		
	imc = peso/ (altura * altura);	
			
if ( sexo == "fem" && imc <19 || sexo == "masc" && imc <20) { 
			System.out.printf(" Abaixo do ideal!");}
else if ( sexo == "fem" && imc < 24 || sexo == "masc" && imc < 25) {
	System.out.printf("Peso ideal!");
}
else{
	System.out.printf("Acima do peso!");
}
	}

}
