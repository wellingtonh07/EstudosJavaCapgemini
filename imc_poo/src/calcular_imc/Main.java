package calcular_imc;

//Ajuda na leitura dos dados informados
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Criando um objeto. Vai herdar peso e altura da classe pessoa.
		Pessoa objetoPessoa = new Pessoa();
		//Faz a leitura do que o usuário escreve no teclado
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Peso da pessoa: ");
		//Dados ficarão guardados em setPeso e setAltura da classe Pessoa
		objetoPessoa.setPeso(leitor.nextFloat());
		System.out.println("Altura da pessoa :");
		objetoPessoa.setAltura(leitor.nextFloat());
		
		//Chamando o metodo calcularIMC()
		System.out.println("IMC = " + objetoPessoa.calcularIMC());
	}
	
	
}
