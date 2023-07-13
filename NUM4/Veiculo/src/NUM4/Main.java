
package NUM4;


public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Branco",256,1998,20000);
        System.out.println(v1);
        
        Motocicleta moto = new Motocicleta("Preto",114,2021,2600,480);
        System.out.println(moto);
        
        Carro c1 = new Carro("verde",200,2060,28000,5);
        System.out.println(c1);
    
        Caminhao cami = new Caminhao("Abroba",14564600,2020,2000000,60);
        System.out.println(cami);
    }
    
}
