package br.edu.univas.main;
import java.util.Scanner;
public class Trabalho1 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int opcao = 0;
		int operacao,x,y;
		float z;
		do  { 
			
					System.out.println("\nEscolha a opera��o que vai utilizar:\n");
					System.out.println("1 - SOMA");
					System.out.println("2 - SUBITRA��O");
					System.out.println("3 - DIVIS�O");
					System.out.println("4 - MULTIPLICA��O");
					System.out.println("9 - Sair");
					
					opcao = leitura.nextInt();
					switch (opcao) {
					case 1:
						System.out.println("A opera��o escolhida � a soma.");
						System.out.println("Digite o primeiro: ");
						x = leitura.nextInt();
						System.out.println("Agora, digite o segundo n�mero: ");
						y = leitura.nextInt();
						z = x + y;
						System.out.println("A soma entre " + x + " e " + y + " � " + (int)z +".");
						break;
					
					case 2:
						System.out.println("A opera��o escolhida � a subtra��o.");
						System.out.println("Digite o primeiro: ");
						x = leitura.nextInt();
						System.out.println("Agora, digite o segundo n�mero: ");
						y = leitura.nextInt();
						z = x - y;
						System.out.println("A subtra��o entre " + x + " e " + y + " � " +(int) z +".");
						break;
					
					case 3:
						System.out.println("A opera��o escolhida � a divis�o.");
						System.out.println("Digite o primeiro: ");
						x = leitura.nextInt();
						System.out.println("Agora, digite o segundo n�mero: ");
						y = leitura.nextInt();
						z = x / y;
						System.out.println("A divis�o entre " + x + " e " + y + " � " + (int)z +".");
						break;
						
					case 4:
						System.out.println("A opera��o escolhida � a multiplica��o.");
						System.out.println("Digite o primeiro: ");
						x = leitura.nextInt();
						System.out.println("Agora, digite o segundo n�mero: ");
						y = leitura.nextInt();
						z = x * y;
						System.out.println("O produto entre " + x + " e " + y + " � " + z +".");
						break;
						
					case 9:
						System.out.println("Voc� escolheu sair. Obrigado!");
						break;
					default:
						System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");
						break;
					}
					
					
					
				
			} while(opcao != 9);
			
			
		
	}
		
}
