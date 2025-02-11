package AbstractFactory;

public class FactoryConcrete1 extends Factory{

	@Override
	Pai recuperar(String opcao) {
		switch(opcao) {
			case "1":
				return new Filho1("atrib1", "atrib2", "atrib3");
			default:
				return null;
		}
		
	}
	
	

}
