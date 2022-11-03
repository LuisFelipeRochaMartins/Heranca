package Conta;

public class ContaEspecial extends Conta{

    private int diasSemJuros;

    private double limite;

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if(limite>0){
            this.limite = limite;
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaEspecial{");
        sb.append("diasSemJuros=").append(diasSemJuros);
        sb.append(", limite=").append(limite);
        sb.append('}');
        return sb.toString();
    }
}
