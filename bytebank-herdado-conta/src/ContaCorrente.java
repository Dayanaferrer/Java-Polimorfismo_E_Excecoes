
public class ContaCorrente extends Conta {
	
	//ContaCorrente agora tem um contrutor
	public ContaCorrente(int agencia, int numero) {
		
		//Chama o construtor especifico
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

}
