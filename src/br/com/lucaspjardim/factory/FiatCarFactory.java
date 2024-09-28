package br.com.lucaspjardim.factory;

/**
 * Fábrica para criar carros da Fiat.
 * @author Lucas Jardim
 */
import br.com.lucaspjardim.cars.Carro;
import br.com.lucaspjardim.cars.FiatCar;
import br.com.lucaspjardim.parts.CarPartsFactory;
import br.com.lucaspjardim.parts.FiatPartsFactory;
import br.com.lucaspjardim.parts.Motor;
import br.com.lucaspjardim.parts.Carroceria;

public class FiatCarFactory implements CarFactory {
    private CarPartsFactory partsFactory;

    public FiatCarFactory() {
        this.partsFactory = new FiatPartsFactory();
    }

    @Override
    public Carro criarCarro() {
        Motor motor = partsFactory.criarMotor();
        Carroceria carroceria = partsFactory.criarCarroceria();
        return new FiatCar(motor, carroceria);
    }
}
