package Builder;

public abstract class BurgerBuilder {
	
	
	
	Burger burger = new Burger();
	
	abstract void buildCarne();
	abstract void buildPao();
	abstract void buildSalada();
	abstract void buildMolho();
	
	Burger build() {
		return burger;
	}

}
