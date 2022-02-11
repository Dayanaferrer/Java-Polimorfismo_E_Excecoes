public class FluxoComTratramento {
	
	public static void main(String[] args) {		
		
        System.out.println("Inicio do main");
        
        try {
        	 metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
        String msg = ex.getMessage();	
        	System.out.println("Exceptio" + msg);
        	ex.printStackTrace();        	
        }        
       
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao  {
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    private static void metodo2 () throws MinhaExcecao{
        System.out.println("Inicio do metodo 2");
        
// Objeto da classe ArithmeticException. Throw joga o objeto exce��o na pilha      
      throw new MinhaExcecao("deu errado a�");
      
                       
       // System.out.println("Fim do metodo 2");
    }

}
