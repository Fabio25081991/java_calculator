package br.edu.univas.main;
import java.util.Scanner;
public class Trabalho1 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int opcao = 0;
		int operacao,x,y;
		float z;
		do  { 
			
					System.out.println("\nEscolha a operação que vai utilizar:\n");
					System.out.println("1 - SOMA");
					System.out.println("2 - SUBITRAÇÃO");
					System.out.println("3 - DIVISÃO");
					System.out.println("4 - MULTIPLICAÇÃO");
					System.out.println("9 - Sair");
					
					opcao = leitura.nextInt();
					switch (opcao) {
					case 1:
						System.out.println("A operação escolhida é a soma.");
						System.out.println("Digite o primeiro: ");
						x = leitura.nextInt();
						System.out.println("Agora, digite o segundo número: ");
						y = leitura.nextInt();
						z = x + y;
						System.out.println("A soma entre " + x + " e " + y + " é " + (int)z +".");
						break;
					
					case 2:
						System.out.println("A operação escolhida é a subtração.");
						System.out.println("Digite o primeiro: ");
						x = leitura.nextInt();
						System.out.println("Agora, digite o segundo número: ");
						y = leitura.nextInt();
						z = x - y;
						System.out.println("A subtração entre " + x + " e " + y + " é " +(int) z +".");
						break;
					
					case 3:
						System.out.println("A operação escolhida é a divisão.");
						System.out.println("Digite o primeiro: ");
						x = leitura.nextInt();
						System.out.println("Agora, digite o segundo número: ");
						y = leitura.nextInt();
						z = x / y;
						System.out.println("A divisão entre " + x + " e " + y + " é " + (int)z +".");
						break;
						
					case 4:
						System.out.println("A operação escolhida é a multiplicação.");
						System.out.println("Digite o primeiro: ");
						x = leitura.nextInt();
						System.out.println("Agora, digite o segundo número: ");
						y = leitura.nextInt();
						z = x * y;
						System.out.println("O produto entre " + x + " e " + y + " é " + z +".");
						break;
						
					case 9:
						System.out.println("Você escolheu sair. Obrigado!");
						break;
					default:
						System.out.println("Opção inválida! Por favor, digite uma opção correta!");
						break;
					}
					
					
					
				
			} while(opcao != 9);
			
			
		
	}
		
}
