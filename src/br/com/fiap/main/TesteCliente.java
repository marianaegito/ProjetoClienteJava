package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

public class TesteCliente {
    // psvm
    public static void main(String[] args) {

        // Instanciar objetos
        Cliente ObjCliente = new Cliente();

        ObjCliente.setNome("Mariana");
        ObjCliente.setCpf("408.358.958-23");
        ObjCliente.setIdade(18);
        ObjCliente.setAltura(1.56);

        // sout
        System.out.println(
                "Nome: " ObjCliente.getNome() +
                "\n\nCPF: " ObjCliente.getCpf() +
                "\n\nIdade: " ObjCliente.getIdade() +
                "\n\nAltura: " ObjCliente.getAltura()
        );

    }
}
