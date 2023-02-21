package herança;

import java.util.Date;

public class Funcionário {
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private float salário;

	public Funcionário() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getSalário() {
		return salário;
	}

	public void setSalário(float salário) {
		this.salário = salário;
	}


	
}
