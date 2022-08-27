package teste;

import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner (System.in);

int primeiro, segundo; 

System.out.printf("digitar primeiro valor  ");
primeiro = ler.nextInt();

System.out.printf("digitar segundo valor  "  );
segundo = ler.nextInt();


if (primeiro > segundo) {
	System.out.printf("O primeiro número é o maior!");}
else if (primeiro == segundo) {
	System.out.printf("Os números são iguais!");}
	else {
		System.out.printf("O segundo número é maior!");}
	

}
 


	}


