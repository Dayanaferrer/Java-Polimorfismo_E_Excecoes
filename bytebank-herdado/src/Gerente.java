// Gerente é um Funcionario. Gerrente herda da class Funcionario. Assina o contrato Autenticavel.
// Pode assinar varios "contratos"

public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	//Criando construtor com nome da classe
		
		public Gerente () {
			this.autenticador = new AutenticacaoUtil();
			
		}
	
	  public double getBonificacao() {
		  System.out.println("Método bonificação do Gerente");
		  return super.getSalario();
	  }

	  @Override
		public void setSenha(int senha) {
			this.autenticador.setSenha (senha);				
		}

		@Override
		public boolean autentica(int senha) {
			return this.autenticador.autentica(senha);
			
			
		}
	
	 
}
