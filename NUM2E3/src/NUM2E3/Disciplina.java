package NUM2E3;

public class Disciplina {
    
    private String Dname;
    
    public Disciplina(){
        
        this(null);
    }
    
    public Disciplina(String Dname){       
        this.Dname = Dname;        
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    @Override
    public String toString() {
        return Dname;
    }

}
