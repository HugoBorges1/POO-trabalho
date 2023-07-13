package num7;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    
    private int numero;
    private double saldo;
    private boolean isEspecial;
    private double limite;
    private List<Movimentacao> movimentacoes;

    public ContaCorrente(int numero, double saldo, boolean isEspecial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.isEspecial = isEspecial;
        this.limite = limite;
        this.movimentacoes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEspecial() {
        return isEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public void adicionarMovimentacao(Movimentacao movimentacao) {
        movimentacoes.add(movimentacao);
        if (movimentacao.isCredito()) {
            saldo += movimentacao.getValor();
        } else {
            saldo -= movimentacao.getValor();
        }
    }

    public boolean podeSacar(double valor) {
        return saldo - valor >= -limite;
    }

    public void sacar(double valor) {
        if (podeSacar(valor)) {
            saldo -= valor;
            movimentacoes.add(new Movimentacao("Saque", valor, false));
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        movimentacoes.add(new Movimentacao("Deposito", valor, true));
    }

    public void emitirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void emitirExtrato() {
        System.out.println("Extrato:");
        for (Movimentacao movimentacao : movimentacoes) {
            String tipoMovimentacao = movimentacao.isCredito() ? "Credito" : "Debito";
            System.out.println("Descricao: " + movimentacao.getDescricao() +
                    ", Valor: " + movimentacao.getValor() +
                    ", Tipo: " + tipoMovimentacao);
        }
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        if (podeSacar(valor)) {
            sacar(valor);
            contaDestino.depositar(valor);
            movimentacoes.add(new Movimentacao("Transferencia para conta " + contaDestino.getNumero(), valor, false));
            contaDestino.movimentacoes.add(new Movimentacao("Transferencia da conta " + numero, valor, true));
        } else {
            System.out.println("Saldo insuficiente para a transferencia.");
        }
    }
  
   
}
