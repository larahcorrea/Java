package entrada_processamento_saida;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n;
		int i=1, a = 1, b = 2, c = 2, d = 3,  numerador, denominador;
		
		System.out.printf("Sequ�ncia: 1/2, 2/3, 3/4, 4/5, ....");
		System.out.printf("Quantos n�meros da sequ�ncia acima voc� gostaria de somar? ");
		n = scn.nextInt();
		
		while(n < 0 || n >= 50) {
			System.out.printf("O n�mero digitado dever� ser POSITIVO e MENOR que cem");
			System.out.printf("Entre com outro n�mero: ");
			n = scn.nextInt();
		}
		
		while (i <= n) {
			if (b == d) {
				numerador = a + c;
				denominador = b;
			} else {
				
			}
		}

	}

}
