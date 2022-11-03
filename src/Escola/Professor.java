package Escola;

public class Professor extends Pessoa1{

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if(disciplina.length()>0){
            this.disciplina = disciplina;
        }
    }
}
