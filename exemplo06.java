package entrada_processamento_saida;

import java.util.Scanner;

public class exemplo06 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);
	
	double dólares, reais;
	
	System.out.printf("Digite a quantidade de dólares");
	dólares = ler.nextFloat();
	
	reais = dólares * 5.1;
	
	System.out.printf( " A sua quantidade em reais é: %.2f",reais );
	 
	
}
}
