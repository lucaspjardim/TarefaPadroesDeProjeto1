package br.com.lucaspjardim.parts;

/**
 * Interface para criação de peças de carro.
 * @author Lucas Jardim
 */
public interface CarPartsFactory {
    Motor criarMotor();
    Carroceria criarCarroceria();
}
