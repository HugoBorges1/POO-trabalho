
package NUM8;


public class Main {

    public static void main(String[] args) {


        Pais brasil = new Pais("Brasil", "Brasilia", 8515767);
        Pais argentina = new Pais("Argentina", "Buenos Aires", 2780400);
        Pais paraguai = new Pais("Paraguai", "Assuncao", 406752);
        Pais uruguai = new Pais("Uruguai", "Montevideu", 176215);
        Pais bolivia = new Pais("Bolivia", "Sucre", 1098581);

        brasil.definirFronteira(argentina);
        brasil.definirFronteira(paraguai);
        brasil.definirFronteira(uruguai);
        brasil.definirFronteira(bolivia);

        System.out.println("Nome: " + brasil.getNome()+", Capital: " + brasil.getCap()+", Dimensao: " + brasil.getDim() + " Km2, Paises que fazem fronteira: " + brasil.getPaisesFronteira());

        System.out.println("Brasil e igual ao Paraguai? " + brasil.equals(paraguai));

        System.out.println("Vizinhos comuns entre Brasil e Argentina: " + brasil.getVizinhosComuns(argentina));
    }
}
        
    
 
