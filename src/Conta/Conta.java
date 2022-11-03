package Conta;

public class Conta {

    private String banco;

    private int agencia;

    private int numeroconta;

    private float saldo;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean saque(double valor){
        if(valor < saldo) {
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean deposito(double valor){
        this.saldo+=valor;
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("banco='").append(banco).append('\'');
        sb.append(", agencia=").append(agencia);
        sb.append(", numeroconta=").append(numeroconta);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
