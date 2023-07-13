package NUM2E3;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        List<Disciplina>disciplinas = new ArrayList<>();
       
        Disciplina d1 = new Disciplina("Matematica");
        Disciplina d2 = new Disciplina("Portugues");
        disciplinas.add(d1);
        disciplinas.add(d2);
        
        Aluno a1 = new Aluno(disciplinas, "eng civil", 657468, "Fulano", 22);
        
        System.out.println(a1.toString()); 
                    
    }
    
}
