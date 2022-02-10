
public class TesteReferencias {

	public static void main(String[] args) {
		
// Refer�ncias mais generica Funcionario poderia ser usada. O gerente � um funcionario! (Polimorfismo)
		Gerente g1 = new Gerente ();
		g1.setNome("Katemari Rosa");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer ds = new Designer();
		ds.setSalario(2000.0);
	
		ControleBonificacao controle = new ControleBonificacao();	
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(ds);
		
		System.out.println(controle.getSoma());

	}

}
