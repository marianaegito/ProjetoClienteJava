package br.com.fiap.entities;

public class Endereco {

    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    // Métodos setters (entrada)
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos getters (retorno)
    public String getLogradouro() {
        return this.logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getCep() {
        return this.cep;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    // Sobrescrevendo toString
    @Override
    public String toString() {
        return "Endereco{" +
                "\n\nlogradouro='" + logradouro + '\'' +
                "\n\nnumero=" + numero +
                "\n\ncomplemento='" + complemento + '\'' +
                "\n\ncep='" + cep + '\'' +
                "\n\nbairro='" + bairro + '\'' +
                "\n\ncidade='" + cidade + '\'' +
                "\n\nestado='" + estado + '\'' +
                '}';
    }
}