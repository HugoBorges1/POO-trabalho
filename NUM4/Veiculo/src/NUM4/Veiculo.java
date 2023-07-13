
package NUM4;

public class Veiculo {

    protected String cor;
    protected int potencia, ano;
    protected double valor;

    public Veiculo(){this(null,0,0,0);}

    public Veiculo(String cor, int potencia, int ano, double valor){

        this.cor=cor;
        this.potencia=potencia;
        this.ano=ano;
        this.valor=valor;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
    @Override
    public String toString(){

        return "Veiculo: - Cor: "+cor+" - Potencia: "+potencia+" - Ano: "+ano+" - Valor: "+valor;

    }
    
    
}
