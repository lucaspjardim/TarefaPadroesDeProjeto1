package br.com.lucaspjardim.cars;

import br.com.lucaspjardim.parts.Motor;
import br.com.lucaspjardim.parts.Carroceria;

/**
 * Classe que representa um carro Fiat.
 * Author: Lucas Jardim
 */
public class FiatCar extends Carro {

    public FiatCar(Motor motor, Carroceria carroceria) {
        super(motor, carroceria);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Fiat Carro - Motor: " + motor.getModelo() + ", Carroceria: " + carroceria.getTipo());
    }

    @Override
    public void exibirInfo() {

    }
}
