package num7;

public class Main {

   
    public static void main(String[] args) {
        
        Banco banco = new Banco();
        

        banco.criarConta(1234, 1000.0, false, 500.0);
        banco.criarConta(5678, 2000.0, true, 1000.0);
        banco.criarConta(6911, 15678,true,100000);
       
        ContaCorrente conta1 = banco.buscarConta(1234);
        ContaCorrente conta2 = banco.buscarConta(5678);
        ContaCorrente conta3 = banco.buscarConta(6911);
        
        conta1.depositar(500.0);
        conta1.sacar(200.0);
        conta2.transferir(conta1, 1000.0);
        conta3.sacar(150);
       
        conta1.emitirSaldo();
        conta1.emitirExtrato();
        conta3.emitirSaldo();
        
    }
    
}
