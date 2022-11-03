package Ambiente;

public class Quarto extends AmbienteM{

    private int capacidade;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if(capacidade>=1){
            this.capacidade = capacidade;
        }
    }
}
