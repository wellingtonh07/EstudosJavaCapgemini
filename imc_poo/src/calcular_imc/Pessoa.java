package calcular_imc;

public class Pessoa {
	
	//Atributos(geralmente são privados)
	private float peso;
	private float altura;
	
	
	//Método
	public float calcularIMC() {
		float imc = peso / (altura * altura);
		return imc;
	}
	
	//Método de acesso aos dados(metodos acessores)
	//Para acessar os atributos privados
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getAltura() {
		return altura;
	}
	
	
}
