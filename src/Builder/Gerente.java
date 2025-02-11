package Builder;

public class Gerente {
	
	private BurgerBuilder receita;
	
	public Gerente(BurgerBuilder receita) {
		this.receita = receita;
	}
	
	public Burger getBurger() {
		
		receita.buildCarne();
		receita.buildPao();
		receita.buildMolho();
		receita.buildSalada();
		
		return receita.build();
	}

}
