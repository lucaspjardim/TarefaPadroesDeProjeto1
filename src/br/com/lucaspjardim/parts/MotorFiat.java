package br.com.lucaspjardim.parts;

/**
 * Implementação do motor específico da Fiat.
 * Author: Lucas Jardim
 */
public class MotorFiat implements Motor {

    @Override
    public String getModelo() {
        return "Motor Fiat 1.0"; // Implementação do método obrigatório
    }
}
