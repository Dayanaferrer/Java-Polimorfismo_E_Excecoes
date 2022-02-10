
//classes abstratas não são obrigadas a implementar um método. Contem metodos abstratos. 
// Interface definimos um contrato e esse contrato precisa ser "assinado"
// "assinar" precisa implementar os metodos  setSenha e autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
