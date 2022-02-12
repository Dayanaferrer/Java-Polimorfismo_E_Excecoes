
public class ContaCorrente extends Conta implements Tributavel {
	
	//ContaCorrente agora tem um contrutor
	public ContaCorrente(int agencia, int numero) {
		
		//Chama o construtor especifico
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
