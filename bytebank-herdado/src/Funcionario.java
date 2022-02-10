
/* Abstract = heran�a;
 	N�o d� pra instaciar um funcion�rio	*/

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	// Contrutor (sempre tem o nome da classe) � diferente de um metodo ele n�o retorna nada.
	public Funcionario() {		
	}	

// M�todo sem corpo (n�o foi implementado aqui).	
 public abstract double getBonificacao ();
	 	
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
	
}
