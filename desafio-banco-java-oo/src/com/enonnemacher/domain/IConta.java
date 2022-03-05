package com.enonnemacher.domain;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta contaDestino, double valor);
}