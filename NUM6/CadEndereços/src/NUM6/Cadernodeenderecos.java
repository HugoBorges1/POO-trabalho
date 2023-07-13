package NUM6;

public class Cadernodeenderecos extends Pessoa {
    
    protected String end;

    public Cadernodeenderecos() {
        
        super(null,null,null,null);
        this.end=null;
    }

    public Cadernodeenderecos(String nome, String telefone, String email, String data, String end) {
        
        super(nome, telefone, email, data);
        this.end=end;
    }
   
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        
        return super.toString()+"{" + "end=" + end + '}';
    }


    
}
