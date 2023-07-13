package NUM4;

public class Carro extends Veiculo {
    
    int assentos;
    
    public Carro(){
        
        super(null,0,0,0);
        this.assentos=0;
    
    }
    
    public Carro(String cor, int potencia, int ano, double valor, int assentos){
        
        super(cor, potencia, ano, valor);
        this.assentos=assentos;
            
    }
    
//metodos
    
    public void setAssentos(int assentos){this.assentos=assentos;}
    
    public int getAssento(){return assentos;}
    
    @Override
    public String toString(){

        return "Carro: - Cor: "+cor+" - Potencia: "+potencia+" - Ano: "+ano+" - Valor: "+valor+" - Assentos: "+assentos;

    }
}
