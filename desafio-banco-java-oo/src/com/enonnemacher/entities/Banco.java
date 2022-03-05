package com.enonnemacher.entities;

import com.enonnemacher.domain.Conta;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Banco {" +
                " contas do banco = " + contas +
                '}';
    }
}
