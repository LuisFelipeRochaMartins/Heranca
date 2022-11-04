package Item;

public class Midia extends Item{

    public Midia(){

    }
    public Midia(String gravadora,float duracao){
        setDuracao(duracao);
        setGravadora(gravadora);
    }

    private String gravadora;

    private float duracao;

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        if (gravadora.length()>0)
            this.gravadora = gravadora;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        if(duracao>0) {
            this.duracao = duracao;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Midia{");
        sb.append("gravadora='").append(gravadora).append('\'');
        sb.append(", duracao=").append(duracao);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
