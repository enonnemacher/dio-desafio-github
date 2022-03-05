package com.enonnemacher.entities;

import com.enonnemacher.domain.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupanca: ");
        super.imprimirInformacoesComuns();
    }
}
