package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

import javax.swing.*;

public class TesteCliente {
    // psvm
    public static void main(String[] args) {

        // Instanciar objetos
        Cliente ObjCliente = new Cliente();

        ObjCliente.setNome(JOptionPane.showInputDialog("Digite o seu nome: "));
        ObjCliente.setCpf(JOptionPane.showInputDialog("Digite o seu CPF: "));
        ObjCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: ")));
        ObjCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: ")));

        // sout
        JOptionPane.showMessageDialog(null,
                "Nome: " + ObjCliente.getNome() +
                "\n\nCPF: " + ObjCliente.getCpf() +
                "\n\nIdade: " + ObjCliente.getIdade() +
                "\n\nAltura: " + ObjCliente.getAltura()
        );

    }
}
