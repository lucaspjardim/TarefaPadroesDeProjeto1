package br.com.lucaspjardim.parts;

/**
 * Author: Lucas Jardim
 */
public class FordPartsFactory implements CarPartsFactory {
    @Override
    public Motor criarMotor() {
        return new MotorFord();
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaFord();
    }
}
