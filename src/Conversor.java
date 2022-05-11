import java.util.Scanner;
public class Conversor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int op;
		String nome;
		float qtd, tot;

		System.out.println("Bem vindo ao Conversor de reais para outras moedas.");
		System.out.println("Qual � o seu nome?");
		nome = teclado.next();
		
		System.out.println("Seja bem vindo(a) " + nome);
		
		System.out.println("O quantos reais voc� deseja converter?");
		qtd = teclado.nextFloat();
		
		System.out.println("Selecione qual moeda voc� deseja converter");
		System.out.println("--------------------");
		System.out.println(" 1 - D�lar ");
		System.out.println(" 2 - Euro ");
		System.out.println(" 3 - D�lar Canadense ");
		System.out.println("--------------------");
		op = teclado.nextInt();
		
		switch (op) {
			case 1:
				tot = (float)(qtd / 5.14);
				System.out.println(qtd + " R$ em D�lar � igual a: " + tot);
				break;
			case 2:
				tot = (float)(qtd/5.40);
				System.out.println(qtd + " R$ em Euro � igual a: " + tot);
				break;
			case 3:
				tot = (float)(qtd/3.95);
				System.out.println(qtd + " R$ em Euro � igual a: " + tot);
				break;
			default:
				System.out.println("Selecione uma op��o valida!");
		}
		
		teclado.close();
	}

}
