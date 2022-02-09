
public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	
	// Contrutor (sempre tem o nome da classe) é diferente de um metodo ele não retorna nada.
	public Funcionario() {
		
	}
	
	public double getBonificacao() {
		return this.salario * 0.05;
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
	
}
