package service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double dividir(double a, double b) {
        return a / b;
    }

}