
package NUM8;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    
    protected String nome, cap;
    protected double dim;
    protected List<Pais> fronteiras;
    
    public Pais() {this(null,null,0);}

    public Pais(String nome, String cap, double dim) {
        this.nome = nome;
        this.cap = cap;
        this.dim = dim;
        this.fronteiras = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public String getCap() {
        return cap;
    }

    public double getDim() {
        return dim;
    }
    
    public List<Pais> getFronteiras(){
        return fronteiras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public void setDim(double dim) {
        this.dim = dim;
    }

    public boolean equals(final Pais outro) {
        return this.nome.equals(outro.getNome()) && this.cap.equals(outro.getCap());
    }

    public void definirFronteira(Pais pais) {
        if (!this.equals(pais)) {
            this.fronteiras.add(pais);
            pais.fronteiras.add(this);
        }
    }

    public List<Pais> getPaisesFronteira() {
        return fronteiras;
    }

    public List<Pais> getVizinhosComuns(Pais outro) {
        List<Pais> vizinhosComuns = new ArrayList<>();

        for (Pais pais : this.fronteiras) {
            if (outro.getFronteiras().contains(pais)) {
                vizinhosComuns.add(pais);
            }
        }

        return vizinhosComuns;
    }
    
    @Override
    public String toString() {
        return "Pais{" + "nome=" + nome + ", cap=" + cap + ", dim=" + dim + '}';
    }
}
