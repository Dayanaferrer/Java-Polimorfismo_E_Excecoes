
//classes abstratas n�o s�o obrigadas a implementar um m�todo. Contem metodos abstratos. 
// Interface definimos um contrato e esse contrato precisa ser "assinado"
// "assinar" precisa implementar os metodos  setSenha e autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
