package teste;

import java.util.Scanner;

public class Exemploo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner (System.in);

int base, altura, área;

System.out.printf("Digite a base  ");
base = ler.nextInt();

System.out.printf("Digite a altura  ");
altura = ler.nextInt();

área = altura * base ; 

if (área > 100) {
	System.out.printf("Terreno Grande!", área);
	
}else {
	System.out.printf("", área);
}


	}

}