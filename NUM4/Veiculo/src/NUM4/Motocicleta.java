
package NUM4;

public class Motocicleta extends Veiculo {
    
    int cilindradas;
    
    public Motocicleta(){
        
        super(null,0,0,0);
        this.cilindradas=0;
    
    }
    
    public Motocicleta(String cor, int potencia, int ano, double valor, int cilindradas){
        
        super(cor, potencia, ano, valor);
        this.cilindradas=cilindradas;
            
    }
        
    public void setCilin(int cilindradas){this.cilindradas=cilindradas;}
    
    public int getCilin(){return cilindradas;}
    
    @Override
    public String toString(){

        return "Moto: - Cor: "+cor+" - Potencia: "+potencia+" - Ano: "+ano+" - Valor: "+valor+" - Cilindradas: "+cilindradas;

    }
}
