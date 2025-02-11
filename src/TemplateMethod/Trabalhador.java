package TemplateMethod;

public abstract class Trabalhador {
	
	private void levantar() {
		System.out.println("levantou");
	}
	
	private void tomarCafe() {
		System.out.println("tomouCafe");
	}
	
	private void irAoTrabalho() {
		System.out.println("foiAoTrabalho");
	}
	
	abstract void Trabalhar();
	
	

}
