package Builder;
public class BuilderDemo {
	
	public static void main(String[] args) {
		ReceitaXB receita = new ReceitaXB();
		Gerente gerente = new Gerente(receita);
		
		System.out.println(gerente.getBurger());		
		
	}
}
