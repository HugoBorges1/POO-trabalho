package num10;

public class Notas {
    
    private double T1, T2, T3, T4, P1, P2;
    
    public Notas(){this(0,0,0,0,0,0);}
    
    public Notas(double T1, double T2, double T3, double T4, double P1, double P2) {
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;
        this.T4 = T4;
        this.P1 = P1;
        this.P2 = P2;
    }

    public double getT1() {
        return T1;
    }

    public void setT1(double T1) {
        this.T1 = T1;
    }

    public double getT2() {
        return T2;
    }

    public void setT2(double T2) {
        this.T2 = T2;
    }

    public double getT3() {
        return T3;
    }

    public void setT3(double T3) {
        this.T3 = T3;
    }

    public double getT4() {
        return T4;
    }

    public void setT4(double T4) {
        this.T4 = T4;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double P1) {
        this.P1 = P1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double P2) {
        this.P2 = P2;
    }
    
    public double getMedia(){
        return ((((T1 + T2 + P1)/3)+((T3 + T4 + P2)/3))/2);
    }
    
    public String getAPP(){
        if(getMedia() >= 6){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }        
    }
    
    @Override
    
    public String toString() {
        return ("Notas\nT1=" + T1 + ", T2=" + T2 + ", T3=" + T3 + ", T4=" + T4 + ", P1=" + P1 + ", P2=" + P2 + "\nMedia: "+getMedia()+"\nResultado: "+getAPP()) ;
    }
    
    
}
