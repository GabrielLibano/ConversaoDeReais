import java.util.Scanner;
public class Conversor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int op;
		String nome;
		float qtd, tot;

		System.out.println("Bem vindo ao Conversor de reais para outras moedas.");
		System.out.println("Qual é o seu nome?");
		nome = teclado.next();
		
		System.out.println("Seja bem vindo(a) " + nome);
		
		System.out.println("O quantos reais você deseja converter?");
		qtd = teclado.nextFloat();
		
		System.out.println("Selecione qual moeda você deseja converter");
		System.out.println("--------------------");
		System.out.println(" 1 - Dólar ");
		System.out.println(" 2 - Euro ");
		System.out.println(" 3 - Dólar Canadense ");
		System.out.println("--------------------");
		op = teclado.nextInt();
		
		switch (op) {
			case 1:
				tot = (float)(qtd / 5.14);
				System.out.println(qtd + " R$ em Dólar é igual a: " + tot);
				break;
			case 2:
				tot = (float)(qtd/5.40);
				System.out.println(qtd + " R$ em Euro é igual a: " + tot);
				break;
			case 3:
				tot = (float)(qtd/3.95);
				System.out.println(qtd + " R$ em Euro é igual a: " + tot);
				break;
			default:
				System.out.println("Selecione uma opção valida!");
		}
		
		teclado.close();
	}

}
