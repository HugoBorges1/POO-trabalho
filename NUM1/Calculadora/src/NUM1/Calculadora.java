
package NUM1;

public class Calculadora {
    
    protected double num1, num2;
    
    public Calculadora(){
        
        this(0,0);
        
    }
    
    public Calculadora(double num1, double num2){
        
        this.num1=num1;
        this.num2=num2;
        
    }
    
    public double getNum1 (){return (num1);}
    
    public double getNum2 (){return (num2);}
    
    public void setNum1(double num1){this.num1=num1;}
    
    public void setNum2(double num2){this.num1=num2;}
    
    public double getSoma(){
        
        return (num1+num2);
        
    }
    
    public double getSub(){
        
        return (num1-num2);
        
    }
    
    public double getMult(){
        
        return (num1*num2);
        
    }
    
    public double getDiv(){
        
        return (num1/num2);
        
    }
    
    @Override
    public String toString(){
        
        return "Calculadora: - soma: "+getSoma()+" - Subtracao: "+getSub()+" - Multiplicacao: "+getMult()+" - Divisao: "+getDiv();
             
    }
}
