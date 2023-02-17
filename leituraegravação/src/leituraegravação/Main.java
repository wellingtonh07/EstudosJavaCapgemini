package leituraegravação;

//Pacote de comando de entrada
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Tipos primitivos e comandos de entrada. Lendo valores e guardando em suas respectivas variáveis
		int idade = leitor.nextInt();
		float cotacaoDolar = leitor.nextFloat();
		double cotacaoEuro = leitor.nextDouble();
		String nome = leitor.nextLine();
		String codigoRua = leitor.next();
		
		System.out.println("Mostra o que está escrito entre aspas e vai para a próxima linha.");
		System.out.print("Mostra o que está escrito entre aspas e termina na mesma linha.");
	}
}
