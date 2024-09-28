package br.com.lucaspjardim.factory;

import br.com.lucaspjardim.cars.Carro;
import br.com.lucaspjardim.cars.FordCar;
import br.com.lucaspjardim.parts.CarPartsFactory;
import br.com.lucaspjardim.parts.FordPartsFactory;
import br.com.lucaspjardim.parts.Motor;
import br.com.lucaspjardim.parts.Carroceria;

/**
 * Fábrica de carros Ford, implementando a criação de carros com as partes da Ford.
 * Author: Lucas Jardim
 */
public class FordCarFactory implements CarFactory {
    private CarPartsFactory partsFactory;

    public FordCarFactory() {
        this.partsFactory = new FordPartsFactory(); // Instancia a fábrica de partes da Ford
    }

    @Override
    public Carro criarCarro() {
        // Cria as partes do carro usando a fábrica de partes
        Motor motor = partsFactory.criarMotor();
        Carroceria carroceria = partsFactory.criarCarroceria();
        // Retorna um novo carro Ford
        return new FordCar(motor, carroceria);
    }
}
