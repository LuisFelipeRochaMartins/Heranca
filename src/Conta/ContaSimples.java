package Conta;

public class ContaSimples extends Conta{

    private double saldoPoupanca;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public boolean depositoPoupanca(double valor){
            this.saldoPoupanca+=valor;
            return true;
    }
    public boolean saquePoupanca(double valor){
        if(valor < saldoPoupanca) {
            this.saldoPoupanca -= valor;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaSimples{");
        sb.append("saldoPoupanca=").append(saldoPoupanca);
        sb.append('}');
        return sb.toString();
    }
}
