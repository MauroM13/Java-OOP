package Mesa0314// Classe base para todos os associados
public class Associado {
    private int codigo;
    private String nome;
    private double taxaMensal;
    private String atividade;

    // Construtor
    public Associado(int codigo, String nome, double taxaMensal, String atividade) {
        this.codigo = codigo;
        this.nome = nome;
        this.taxaMensal = taxaMensal;
        this.atividade = atividade;
    }

    // Métodos getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getTaxaMensal() {
        return taxaMensal;
    }

    public String getAtividade() {
        return atividade;
    }

    // Métodos setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTaxaMensal(double taxaMensal) {
        this.taxaMensal = taxaMensal;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}

// Classe para associados que têm acesso à piscina
class AssociadoPiscina extends Associado {
    private boolean habilitado;
    private double custoExtra;

    // Construtor
    public AssociadoPiscina(int codigo, String nome, double taxaMensal, String atividade,
                            boolean habilitado, double custoExtra) {
        super(codigo, nome, taxaMensal, atividade);
        this.habilitado = habilitado;
        this.custoExtra = custoExtra;
    }

    // Métodos getters
    public boolean isHabilitado() {
        return habilitado;
    }

    public double getCustoExtra() {
        return custoExtra;
    }

    // Métodos setters
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public void setCustoExtra(double custoExtra) {
        this.custoExtra = custoExtra;
    }

    // Método para calcular a taxa mensal total do associado (incluindo o custo extra da piscina, se aplicável)
    public double calcularTaxaMensalTotal() {
        if (habilitado) {
            return getTaxaMensal() + custoExtra;
        } else {
            return getTaxaMensal();
        }
    }
}



