package controlador;

import modelo.Saluda;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Saluda saludo=new Saluda();
		String saludado="Fernando Ortiz";
		saludo.diHola(saludado);

	}

}
