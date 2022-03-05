package com.enonnemacher;

import com.enonnemacher.domain.Conta;
import com.enonnemacher.entities.Banco;
import com.enonnemacher.entities.Cliente;
import com.enonnemacher.entities.ContaCorrente;
import com.enonnemacher.entities.ContaPoupanca;

import java.util.Arrays;

/* TODO
 *  IMPLEMENTAR IMPRESSAO DE CLIENTES DO BANCO
 *  INCLUIR LOMBOK*/

public class Main {

    public static void main(String[] args) {

        Cliente ederson = new Cliente();
        ederson.setNome("Ederson");

        Conta contaCorrente = new ContaCorrente(ederson);
        Conta contaPoupanca = new ContaPoupanca(ederson);

        contaCorrente.depositar(100);
        contaCorrente.transferir(contaPoupanca, 100);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        Banco teste = new Banco();
        teste.setContas(Arrays.asList(contaCorrente, contaPoupanca));
        System.out.println(teste.toString());
    }
}
