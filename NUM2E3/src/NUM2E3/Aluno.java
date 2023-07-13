package NUM2E3;

import java.util.List;

public class Aluno extends Pessoa {
    
    //Atributos
    
    private List<Disciplina> disciplinas;
    private String Curso;
    
    //Construtores

    public Aluno(List<Disciplina> disciplinas, String Curso, int Cpf, String Nome, int Idade) {
        super(Cpf, Nome, Idade);
        this.disciplinas = disciplinas;
        this.Curso = Curso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    @Override
    public String toString() {
        return toSttring()+" disciplinas:" + disciplinas + ", Curso=" + Curso;
    }

  
    
    
}
