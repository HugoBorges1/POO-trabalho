package NUM6;

public class Pessoa {
  
    protected String nome, telefone, email, data;
    
    public Pessoa() {this(null,null,null,null);}
    
    public Pessoa(String nome, String telefone, String email, String data) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.data = data;
    }
    
    //metodos

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getData() {
        return data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", data=" + data + '}';
    }
    
    
    
    
    
}
