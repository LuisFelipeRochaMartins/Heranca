package Item;

public class Livro extends Item{

    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor.length()>0) {
            this.autor = autor;
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("autor='").append(autor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
