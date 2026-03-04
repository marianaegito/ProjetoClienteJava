package br.com.fiap.entities;

public class Produto {

        // Visibilidade, tipo de dados e atributos
        private int codigo;
        private String tipo;
        private String marca;
        private double preco;

        // Métodos setters (entrada)
        public void setCodigo(int codigo){
            this.codigo = codigo;
        }

        public void setTipo(String tipo){
            this.tipo = tipo;
        }

        public void setMarca(String marca){
            this.marca = marca;
        }

        public void setPreco(double preco){
            this.preco = preco;
        }

        // Métodos getters (retorno)
        public int getCodigo(){
            return this.codigo;
        }

        public String getTipo(){
            return this.tipo;
        }

        public String getMarca(){
            return this.marca;
        }

        public double getPreco(){
            return this.preco;
        }

        // Sobrescrevendo toString
        @Override
        public String toString() {
            return "Produto{" +
                    "\n\ncodigo=" + codigo +
                    "\n\ntipo='" + tipo + '\'' +
                    "\n\nmarca='" + marca + '\'' +
                    "\n\npreco=" + preco +
                    '}';
        }
}

