package br.com.lucaspjardim;

import br.com.lucaspjardim.cars.Carro;
import br.com.lucaspjardim.factory.CarFactory;
import br.com.lucaspjardim.factory.FordCarFactory;
import br.com.lucaspjardim.factory.FiatCarFactory;

/**
 * Classe principal para simulação da fábrica de carros.
 * Author: Lucas Jardim
 */
public class Main {
    public static void main(String[] args) {
        // Criando carro Ford
        CarFactory fordFactory = new FordCarFactory();
        Carro fordCar = fordFactory.criarCarro();
        fordCar.exibirInfo(); // Ajustando para o método exibirInfo()

        // Criando carro Fiat
        CarFactory fiatFactory = new FiatCarFactory();
        Carro fiatCar = fiatFactory.criarCarro();
        fiatCar.exibirInfo(); // Ajustando para o método exibirInfo()
    }
}
