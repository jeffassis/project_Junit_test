package br.com.example.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.example.model.Funcionario;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));

        if (valor.compareTo(new BigDecimal("1000")) > 0) {
           throw new IllegalArgumentException("Funcionario com salario acima de R$:1000,00 não pode receber bonus");
        }
        return valor.setScale(2, RoundingMode.HALF_UP);
    }
}
