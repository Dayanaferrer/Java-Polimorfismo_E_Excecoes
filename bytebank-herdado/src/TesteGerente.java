
public class TesteGerente {

	public static void main(String[] args) {
		Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Marian Croak");
		g1.setCpf("05896354111");
		g1.setSalario(5000.0);
		
		System.out.println("Nome:" + g1.getNome());
		System.out.println("Cpf:" + g1.getCpf());
		System.out.println("Salário R$:" + g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticar = g1.autentica(2222);
		
		System.out.println(autenticar);
		
		System.out.println("Bonificação R$:" +g1.getBonificacao());



	}

}
