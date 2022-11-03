package Veiculo;

public class Carro extends Veiculo{

    public int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        if(portas>0){
            this.portas = portas;
        }
    }
}
