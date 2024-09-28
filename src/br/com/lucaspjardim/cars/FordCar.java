package br.com.lucaspjardim.cars;

import br.com.lucaspjardim.parts.Motor;
import br.com.lucaspjardim.parts.Carroceria;

/**
 * Classe que representa um carro Ford.
 * Author: Lucas Jardim
 */
public class FordCar extends Carro {

    public FordCar(Motor motor, Carroceria carroceria) {
        super(motor, carroceria);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Ford Carro - Motor: " + motor.getModelo() + ", Carroceria: " + carroceria.getTipo());
    }

    @Override
    public void exibirInfo() {
        System.out.println("Informações do Ford Carro: " + motor.getModelo() + ", " + carroceria.getTipo());
    }
}
