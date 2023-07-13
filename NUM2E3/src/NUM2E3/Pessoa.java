package NUM2E3;

public class Pessoa {
    
    //atributos
    
    protected int Cpf, Idade;
    protected String Nome;
    
    //construtores
    
    public Pessoa(int Cpf, String Nome, int Idade){
        
        this.Cpf = Cpf;
        this.Nome = Nome;
        this.Idade = Idade;
        
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String toSttring() {
        return "Cpf=" + Cpf + ", Idade=" + Idade + ", Nome=" + Nome ;
    }

    

   
    
}
