package conta-bancaria;

public class ContaBancaria {

    private String nomeDoTitular;
    private double saldo;
    private Tipo tipoDaConta;

    public void depositarValor(double valor) {
        this.saldo += valor;
    }

    public double sacarValor(double valor) {
        this.saldo -= valor;
        return valor;
    }

    public String exibirInfo() {
        return 
    }
}