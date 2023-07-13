package num7;

public class Movimentacao {
    
    private String descricao;
    private double valor;
    private boolean isCredito;

    public Movimentacao(String descricao, double valor, boolean isCredito) {
        this.descricao = descricao;
        this.valor = valor;
        this.isCredito = isCredito;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isCredito() {
        return isCredito;
    }
 
}
