
public class ControleBonificacao {
	
	private double soma;
	
	// Mesmo usando uma refer�ncia gen�rica, ao executar sempre chamar� o codigo especifico.(Polimorfismo)
	public void registra (Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;				
	}
		
	public double getSoma() {
		return soma;
	}

}
