package AbstractFactory;



public class FactoryCocrete2 extends Factory{
	@Override
	Pai recuperar(String opcao) {
		switch(opcao) {
			case "1":
				return new Filho2("atrib1", "atrib2", "atrib3");
			default:
				return null;
		}
		
		
	}
}
