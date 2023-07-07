package challenge;

public class Main {

	public static void main(String[] args) {
		estacionamento estacionamento = new estacionamento();
		Carro car1 = new Carro("Ferrari", "Vermelho", "ABC-1234", 180);
		Carro car2 = new Carro("Kombi", "Azul", "MIT-2222", 189);
		Carro car3 = new Carro("Lamborghini", "Roxo", "KLJ-1313", 120);
		Carro car4 = new Carro("Mini Cooper", "Rosa", "WSA-2929", 269);
		Carro car5 = new Carro("Opala SS", "Laranja", "FDS-3933", 250);
		Carro car6 = new Carro("Porsche 911", "Verde Lima", "POS-0909", 220);
		Carro car7 = new Carro("Fuscao", "Preto", "FUS-6969", 320);

		estacionamento.addCarro(car1);
		estacionamento.addCarro(car2);
		estacionamento.addCarro(car3);
		estacionamento.addCarro(car4);
		estacionamento.addCarro(car5);
		estacionamento.addCarro(car6);
		estacionamento.addCarro(car7);

		estacionamento.listCarros();
	}
}
