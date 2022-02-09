
public class ControleBonificacao {
	
	private double soma;
	
	// Mesmo usando uma referência genérica, ao executar sempre chamará o codigo especifico.(Polimorfismo)
	public void registra (Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;				
	}
		
	public double getSoma() {
		return soma;
	}

}
