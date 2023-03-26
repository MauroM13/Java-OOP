package Mesa0103;

public class ClienteBanco {

    public class Cliente {
        private int numeroCliente;
        private String nome;
        private double divida;

        public Cliente(int numeroCliente, String nome) {
            this.numeroCliente = numeroCliente;
            this.nome = nome;
            this.divida = 0.0; // por padrão, o cliente começa sem dívida
        }

        public void aumentarDivida(double valor) {
            this.divida += valor;
        }

        public void pagarDivida(double valor) {
            if (valor <= this.divida) {
                this.divida -= valor;
            } else {
                System.out.println("Erro: valor de pagamento excede a dívida atual.");
            }
        }

        // getters e setters para os atributos da classe
        public int getNumeroCliente() {
            return numeroCliente;
        }

        public void setNumeroCliente(int numeroCliente) {
            this.numeroCliente = numeroCliente;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getDivida() {
            return divida;
        }

        public void setDivida(double divida) {
            this.divida = divida;
        }
    }
}
