package Veiculo;

public class Moto extends Veiculo{
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        if(cilindradas>0) {
            this.cilindradas = cilindradas;
        }
    }
}
