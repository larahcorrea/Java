package entrada_processamento_saida;

import java.util.Scanner;

public class Ex39F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
int ultimo, penultimo, count, termo;
		
		ultimo = 1;
		penultimo = 1;
		termo = 0;
		
		System.out.printf("0\n");
		System.out.printf("1\n");
		System.out.printf("1\n");
		for (count = 3; count <= 30; count++) {
			termo = ultimo + penultimo;
		    penultimo = ultimo;
		    ultimo = termo;
		    System.out.printf("%d\n", termo);
		    
		    ler.close();
		}
	}

}