// Se você só quer Reutilização de código – composição - interfaces

public class AutenticacaoUtil {
	
	private int senha = 2222;
	
	public void setSenha(int senha) {
		this.senha=senha;
		
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
		
	}
	 
}
