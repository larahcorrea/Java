package entrada_processamento_saida;

import java.util.Scanner;

public class exemplo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner (System.in);

double p1, p2, p3, p4, p5, pagamento, troco;
System.out.printf("Digite o primeiro valor");
p1 = ler.nextInt();

System.out.printf("Digite o segundo valor");
p2 = ler.nextDouble();

System.out.printf("Digite o terceiro valor");
p3 = ler.nextDouble();

System.out.printf("Digite o quarto valor");
p4 = ler.nextDouble();

System.out.printf("Digite o quinto valor");
p5 = ler.nextDouble();

System.out.printf("Digite o valor do seu pagamento");
pagamento = ler.nextDouble();

troco = pagamento - (p1 +p2 + p3 + p4 + p5);

System.out.printf( "O seu troco é: %.2f", troco);







	}

}
