package br.com.lucaspjardim.factory;

import br.com.lucaspjardim.cars.Carro;

/**
 * Interface para criar diferentes tipos de carros.
 * @author Lucas Jardim
 */
public interface CarFactory {
    Carro criarCarro();
}
