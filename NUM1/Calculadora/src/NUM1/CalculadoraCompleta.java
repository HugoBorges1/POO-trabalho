
package NUM1;

public class CalculadoraCompleta extends Calculadora {
    
    public CalculadoraCompleta(){
        
        super(0,0);
        
    }
    
    public CalculadoraCompleta(double num1, double num2){
        
        super(num1,num2);
        
    }
    
    public double getPot1(){
        
        return(Math.pow(num1, 2));
        
    }
    
    public double getPot2(){
        
        return(Math.pow(num2, 2));
        
    }

    public double getRaiz1(){
        
        return(Math.sqrt(num2));
        
    }
        
    public double getRaiz2(){
        
        return(Math.sqrt(num1));
        
    }

    @Override
    public String toString(){
        
        return "Calculadora: - soma: "+getSoma()+" - Subtracao: "+getSub()+" - Multiplicacao: "+getMult()+" - Divisao: "+getDiv()+" - Raiz num1: "+getRaiz1()+" - Raiz num2: "+getRaiz2()+" - Potencia num1: "+getPot1()+" - Potencia num2: "+getPot2();
             
    }
    
}
