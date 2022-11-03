package BombaCombustivel;

public class Bomba {

    private double totalLitros;

    private float valorLitro;

    public double getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros(double totalLitros) {
        if(totalLitros>0){
            this.totalLitros = totalLitros;
        }
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }


    public boolean abastecerPorLitro(int litros){
        if(totalLitros>litros){
            return true;
        }
        return false;
    }
    public boolean abastecerPorValor(double valor){
        double comb = valor/valorLitro;

        if(comb>totalLitros){
            return false;
        }
        return true;
    }
}
