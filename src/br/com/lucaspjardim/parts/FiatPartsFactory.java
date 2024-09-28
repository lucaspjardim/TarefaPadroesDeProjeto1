package br.com.lucaspjardim.parts;

/**
 * Fábrica de peças para carros Fiat.
 * @author Lucas Jardim
 */
public class FiatPartsFactory implements CarPartsFactory {

    @Override
    public Motor criarMotor() {
        return new MotorFiat();
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaFiat();
    }
}
