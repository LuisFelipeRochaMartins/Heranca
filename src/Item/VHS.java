package Item;

public class VHS extends Midia{

    private String titulo;
    public VHS(){

    }
    public VHS(String titulo){
        setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.length()>0) {
            this.titulo = titulo;
        }
    } @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VHS{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }


}
