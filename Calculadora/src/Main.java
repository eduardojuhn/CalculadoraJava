import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		double n1, n2;
		double adicao, subtracao, multiplicacao, divisao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo valor:");
		n2 = sc.nextDouble();
		
		System.out.println("Selecione uma Opera��o: \n[1] - Somar \n[2] - Subtrair \n[3] - Multiplicar \n[4] - Dividir");
		opcao = sc.nextInt();
		
		switch(opcao) {
			case 1: 
				adicao = n1 + n2;
				System.out.println("A soma �: " + adicao);
				break;
			case 2:
				subtracao = n1 - n2;
				System.out.println("A subtra��o �: " + subtracao);
				break;
			case 3:
				multiplicacao = n1 * n2;
				System.out.println("A multiplica��o �: " + multiplicacao);
				break;
			case 4: 
				if(n1>n2) {
					System.out.println("Imposs�vel realizar a opera��o.");
				} 
				else {
					divisao = n1 / n2;
					System.out.println("A divis�o �: " + divisao);
				}
				break;
				
				default: 
					System.out.println("Opera��o Inv�lida.");
		}
		
	}

}
