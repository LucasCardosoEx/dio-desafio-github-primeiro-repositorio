package com.dio.oo.funcionario;

public class Run {
    Funcionario funcionario = new Funcionario();

    //Upcasts
    Funcionario gerente = new Gerente();
    Funcionario vendedor = new Vendedor();
    Funcionario faxineiro = new Faxineiro();

    //Downcasts (deve evitar ser usado por causa dos erros)
    Vendedor vendedor1 = (Vendedor) new Funcionario();
}
