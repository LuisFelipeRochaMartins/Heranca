package NaveEspacial;

public class Nave {

    private double maxVelocidade;

    public double getMaxVelocidade() {
        return maxVelocidade;
    }

    public void setMaxVelocidade(double maxVelocidade) {
        if(maxVelocidade>0){
            this.maxVelocidade = maxVelocidade;
        }
    }
}
