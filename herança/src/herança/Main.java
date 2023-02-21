//Um pouco sobre herança em Java

package herança;

import java.util.Date;

public class Main {
	
	
	public static void main(String[] args) {
		
		Vendedor v = new Vendedor();
		// set = definir
		v.setNome("ana");
		v.setSalário(100.0f);
		v.setCpf("245434401");
		v.setDataNascimento(new Date());
		v.setComissaoPorItem(10.0f);
		v.setTotalItensVendidos(10);
		
		
		System.out.println("O salário do vendedor é: " + v.calcularSalario());
		
		Motorista m = new Motorista();
	}


}
