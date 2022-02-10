
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(011, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca (022, 222);
		cp.deposita(200.00);
		
		cc.transfere(10.0, cp);
		System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
		System.out.println("\nSaldo Conta Poupança: " + cp.getSaldo());
	}

}
