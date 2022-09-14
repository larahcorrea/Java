package entrada_processamento_saida;

/*
 * Exerc�cio 41 - Calcular e exibir a soma dos �N� primeiros valores da seq��ncia abaixo. O valor �N� 
 * ser� digitado, dever� ser positivo, mas menor que cem. Caso o valor n�o satisfa�a a restri��o, 
 * enviar mensagem de erro e solicitar o valor novamente.A seq��ncia: 2, 5, 10, 17, 26, ....
 */

import java.util.Scanner;

public class Ex41While {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n;
		int i=1, a = 1, b = 1, soma = 0;
		
		
		System.out.printf("Sequ�ncia: 2, 5, 10, 17, 26, ....");
		System.out.printf("Quantos n�meros da sequ�ncia acima voc� gostaria de somar? ");
		n = scn.nextInt();
		
		while(n < 0 || n >= 100) {
			System.out.printf("O n�mero digitado dever� ser POSITIVO e MENOR que cem");
			System.out.printf("Entre com outro n�mero: ");
			n = scn.nextInt();
		}
		
		while(i <= n) {
			a = a + b;
			soma = soma + a;
			b = b + 2;
			i++;
		}
		
		System.out.println("A soma dos primeiros " + n + " n�meros da sequ�ncia � " + soma);

	}

}
