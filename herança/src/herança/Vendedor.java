package herança;

import java.util.Date;

//Herança
//Pegando as informações da classe funcionário usando o extends
public class Vendedor extends Funcionário {
	
	private int totalItensVendidos;
	private float comissaoPorItem;
	
	public Vendedor() {
		//Pega dados da classe funcionário, ou seja, é um funcionário
		super(); 
	}

	//this pega dados dessa classe
	//super pega dados da classe funcionário
	public float calcularSalario() {
		return super.getSalário() + (this.comissaoPorItem * totalItensVendidos);
	}

	public int getTotalItensVendidos() {
		return totalItensVendidos;
	}

	public void setTotalItensVendidos(int totalItensVendidos) {
		this.totalItensVendidos = totalItensVendidos;
	}

	public float getComissaoPorItem() {
		return comissaoPorItem;
	}

	public void setComissaoPorItem(float comissaoPorItem) {
		this.comissaoPorItem = comissaoPorItem;
	}
	
	
	
}
