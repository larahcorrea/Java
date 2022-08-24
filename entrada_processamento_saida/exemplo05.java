package entrada_processamento_saida;

import java.util.Scanner;

public class exemplo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner (System.in);
double celsius , fahrenheit;
System.out.printf("Informe o grau em Celsius: ");
celsius = ler.nextInt();

fahrenheit = (celsius * 1.8) + 32 ;
System.out.printf("A temperatura em Fahrehnheit é: %.1f", fahrenheit);

   }

}
