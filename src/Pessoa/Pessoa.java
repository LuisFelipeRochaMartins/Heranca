package Pessoa;

public class Pessoa {

    private String name;

    private String endereco;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>0) {
            this.name = name;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.length()>0){
            this.endereco = endereco;
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaMain{");
        sb.append("name='").append(name).append('\'');
        sb.append(", endereco='").append(endereco).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
