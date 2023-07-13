package num7;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private List<ContaCorrente> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void criarConta(int numero, double saldo, boolean isEspecial, double limite) {
        ContaCorrente novaConta = new ContaCorrente(numero, saldo, isEspecial, limite);
        contas.add(novaConta);
        System.out.println("Conta " + numero + " criada com sucesso.");
    }

    public void excluirConta(int numero) {
        for (ContaCorrente conta : contas) {
            if (conta.getNumero() == numero) {
                contas.remove(conta);
                System.out.println("Conta " + numero + " excluida com sucesso.");
                return;
            }
        }
        System.out.println("Conta " + numero + " nao encontrada.");
    }

    public ContaCorrente buscarConta(int numero) {
        for (ContaCorrente conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        System.out.println("Conta " + numero + " nao encontrada.");
        return null;
    }
    
}
