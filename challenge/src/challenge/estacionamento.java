package challenge;

import java.util.ArrayList;

class Carro {

	String modelo;
	String cor;
	String placa;
	int velocidadeMaxima;

	Carro(String modelo, String cor, String placa, int velocidadeMaxima) {
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.velocidadeMaxima = velocidadeMaxima;
	}
}

public class estacionamento {
	ArrayList<Carro> carros = new ArrayList<Carro>();

	public void addCarro(Carro carro) {
		carros.add(carro);
	}

	public void listCarros() {
		for (Carro carro : carros) {
			System.out.println("Modelo: " + carro.modelo +"Cor: " + carro.cor + ", Placa: " + carro.placa + ", Velocidade Máxima: " + carro.velocidadeMaxima+ "Km/h");
			System.out.println();
		}
		
	}
	
	
}
