package teste;

import java.util.Scanner;

public class Exemploo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner (System.in);

int num1, num2, num3;

System.out.printf("digitar primeiro valor  ");
num1 = ler.nextInt();

System.out.printf("digitar segundo valor  "  );
num2 = ler.nextInt();

System.out.printf("digitar terceiro valor  "  );
num3 = ler.nextInt();

if (num1 > num2 && num1 > num3) {

System.out.printf("O primeiro número é o maior!");}

else if (num1 == num2 == num3) {
	System.out.printf("Os números são iguais!");
}
else { 
	System.out.printf("O segundo número é maior!");
}

}
	}

