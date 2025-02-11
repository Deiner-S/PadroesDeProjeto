package Builder;

public class ReceitaXB extends BurgerBuilder {

	@Override
	void buildCarne() {
		this.burger.setCarne("costela");
		
	}

	@Override
	void buildPao() {
		this.burger.setPao("brioche");
		
	}

	@Override
	void buildSalada() {
		this.burger.setSalada("alface");		
	}

	@Override
	void buildMolho() {
		this.burger.setMolho("mostarda");		
	}
	

}
