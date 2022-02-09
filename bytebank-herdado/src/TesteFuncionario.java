
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Alexia Ferreira");
		funcionario.setCpf("05752680169");
		funcionario.setSalario(2600.00);
		
		System.out.println("Nome:" + funcionario.getNome());
		System.out.println("Cpf:" + funcionario.getCpf());
		System.out.println("Bonificação R$:" + funcionario.getBonificacao());
		
		//funcionario.salario = 300.0;
		

	}

}
