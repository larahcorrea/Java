package entrada_processamento_saida;

import java.util.Scanner;

public class Ex37DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, t, i2;
		
		i = 1;
		do {
			i2 = 1;
			do {
				t = i * i2;
		        System.out.printf("%d x %d = %d\n", i, i2, t);
		        i2++;
		}while (i2 <= 10);
			i++;
		    System.out.printf("Aperte ENTER");
		    ler.nextLine();
		} while(i <= 20);
		
		ler.close();
	}

}
