package NUM4;

public class Caminhao extends Veiculo {
 
    int pcarga;
    
    public Caminhao(){
        
        super(null,0,0,0);
        this.pcarga=0;
    
    }
    
    public Caminhao(String cor, int potencia, int ano, double valor, int pcarga){
        
        super(cor, potencia, ano, valor);
        this.pcarga=pcarga;
            
    }
    
    public void setCarga(int pcarga){this.pcarga=pcarga;}
    
    public int getCarga(){return pcarga;}
    
    @Override
    public String toString(){

        return "Caminhão: - Cor: "+cor+" - Potencia: "+potencia+" - Ano: "+ano+" - Valor: "+valor+" - Peso da carga: "+pcarga+"Kg";

    }
    
}
