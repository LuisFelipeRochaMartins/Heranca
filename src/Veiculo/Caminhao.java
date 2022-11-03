package Veiculo;

public class Caminhao extends Veiculo{

    private int eixos;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if(eixos>0) {
            this.eixos = eixos;
        }
    }
}
