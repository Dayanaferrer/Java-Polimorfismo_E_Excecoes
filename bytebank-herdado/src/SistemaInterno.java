
public class SistemaInterno {
	
	private int senha = 3333;
	
	public void autentica (Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Entrada Liberada!" + fa);
		}else {
			System.out.println("Acesso n�o permitido!!!" + fa);
		}
	}

}
