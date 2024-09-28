package br.com.lucaspjardim.cars;

/**
 * Classe abstrata que representa um carro genérico.
 * Author: Lucas Jardim
 */
import br.com.lucaspjardim.parts.Motor;
import br.com.lucaspjardim.parts.Carroceria;

public abstract class Carro {
    protected Motor motor;
    protected Carroceria carroceria;

    public Carro(Motor motor, Carroceria carroceria) {
        this.motor = motor;
        this.carroceria = carroceria;
    }

    public abstract void exibirDetalhes();

    public abstract void exibirInfo();
}
