package AbstractFactory;
/**
 * E um padrao de projeto utilizado muitas vezes para instanciar familias de objetos. 
 */
public abstract class Factory {
	
	abstract Pai recuperar(String opcao);

}
