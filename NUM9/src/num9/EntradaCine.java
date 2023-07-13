package num9;

public class EntradaCine {
    
    private String DataFilme;
    private double Horario;
    private double Valor;
    private int Sala;
    private int IdadeCli;
    private int CarteiraEstudante;
    private double Disconto;
    private double DescHor;
    
    public EntradaCine(){
        this(null,0.0, 0.0 , 0,0,0);
    }

    public EntradaCine(String DataFilme, double Horario, double Valor, int Sala, int IdadeCli, int CarteiraEstudante) {
        this.DataFilme = DataFilme;
        this.Horario = Horario;
        this.Valor = Valor;
        this.Sala = Sala;
        this.IdadeCli = IdadeCli;
        this.CarteiraEstudante = CarteiraEstudante;
        
    }

    public double getDescHor() {
        return DescHor;
    }

    public void setDescHor(double DescHor) {
        this.DescHor = DescHor;
    }
    
    public double getDisconto() {
        return Disconto;
    }

    public void setDisconto(double Disconto) {
        this.Disconto = Disconto;
    }
    
    public String getDataFilme() {
        return DataFilme;
    }

    public void setDataFilme(String DataFilme) {
        this.DataFilme = DataFilme;
    }

    public double getHorario() {
        return Horario;
    }

    public void setHorario(double Horario) {
        this.Horario = Horario;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getSala() {
        return Sala;
    }

    public void setSala(int Sala) {
        this.Sala = Sala;
    }

    public int getIdadeCli() {
        return IdadeCli;
    }

    public void setIdadeCli(int IdadeCli) {
        this.IdadeCli = IdadeCli;
    }

    public int getCarteiraEstudante() {
        return CarteiraEstudante;
    }

    public void setCarteiraEstudante(int CarteiraEstudante) {
        this.CarteiraEstudante = CarteiraEstudante;
    }
    
    public double getDesconto(){
        if(getIdadeCli() > 0 && getIdadeCli() <= 12){
            Disconto = (getValor() - (getValor() * 0.50));
            setDisconto(Disconto); 
        }
  
        if(getIdadeCli() > 12 && getIdadeCli() <= 15){
            Disconto = (getValor() - (getValor() * 0.40));
            setDisconto(Disconto);         
        }
        
        if(getIdadeCli() >= 16 && getIdadeCli() <= 20){
            Disconto = (getValor() - (getValor() * 0.30));
            setDisconto(Disconto);         
        }
        
        if(getIdadeCli() > 20){
            Disconto = (getValor() - (getValor() * 0.20));
            setDisconto(Disconto);            
        }
        
        if(getHorario() <= 16){    
            return getDisconto() - (getDisconto()*0.10);
        }
        else{
            return getDisconto();    
        }
        
    }
    
    public String ToString(){
        return("Dados do Filme \nData: "+getDataFilme()+" Hora: "+getHorario()+" Sala: "+getSala()+"\nValor do ingresso: "+getValor()+"\nValor com Descontos: "+getDesconto()+"\nNumero da carteirinha: "+getCarteiraEstudante());  
    }
 
}
