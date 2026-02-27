package br.com.fiap.main;
import  javax.swing.*;

import br.com.fiap.entities.Cliente;

import javax.swing.*;


public class TesteCliente {

    // String
    static  String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // Int
    static int inteiro(String j){
        return  Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // Double
    static double real(String j){
        return Double.parseDouble((JOptionPane.showInputDialog(j)));
    }
    // psvm
    public static void main(String[] args) {


        // Instanciar objetos
        Cliente ObjCliente = new Cliente();

        ObjCliente.setNome(texto("Digite o seu nome: "));
        ObjCliente.setCpf(texto("Digite o seu CPF: "));
        ObjCliente.setIdade(inteiro("Informe a sua idade: ")));
        ObjCliente.setAltura(real("Informe a sua altura: ")));

        // sout
        JOptionPane.showMessageDialog(null,
                "Nome: " + ObjCliente.getNome() +
                "\n\nCPF: " + ObjCliente.getCpf() +
                "\n\nIdade: " + ObjCliente.getIdade() +
                "\n\nAltura: " + ObjCliente.getAltura()
        );

    }
}
