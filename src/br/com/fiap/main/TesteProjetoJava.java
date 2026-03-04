package br.com.fiap.main;

import javax.swing.*;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Produto;
import br.com.fiap.entities.Endereco;

public class TesteProjetoJava {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Instanciar objetos
        Cliente ObjCliente = new Cliente();
        Produto objProduto = new Produto();
        Endereco objEndereco = new Endereco(); // ✅ FALTAVA ISSO

        // Entradas do Cliente
        ObjCliente.setNome(texto("Digite o seu nome: "));
        ObjCliente.setCpf(texto("Digite o seu CPF: "));
        ObjCliente.setIdade(inteiro("Informe a sua idade: "));
        ObjCliente.setAltura(real("Informe a sua altura: "));

        // Entradas do Produto
        objProduto.setCodigo(inteiro("Cadastro de Produto\n\nInforme o código do produto: "));
        objProduto.setTipo(texto("Tipo de Produto\n\nInforme o tipo do produto: "));
        objProduto.setMarca(texto("Marca do Produto\n\nInforme a marca do produto: "));
        objProduto.setPreco(real("Preço do Produto\n\nInforme o preço do produto: "));

        // Entradas do Endereço
        objEndereco.setLogradouro(texto("Informe o logradouro: "));
        objEndereco.setNumero(inteiro("Informe o número: "));
        objEndereco.setComplemento(texto("Informe o complemento: "));
        objEndereco.setCep(texto("Informe o CEP: "));
        objEndereco.setBairro(texto("Informe o bairro: "));
        objEndereco.setCidade(texto("Informe a cidade: "));
        objEndereco.setEstado(texto("Informe o estado: "));

        // Exibir tudo
        JOptionPane.showMessageDialog(null,
                "===== CLIENTE =====\n" +
                        ObjCliente.toString() +

                        "\n\n===== PRODUTO =====\n" +
                        objProduto.toString() +

                        "\n\n===== ENDEREÇO =====\n" +
                        objEndereco.toString()
        );
    }
}