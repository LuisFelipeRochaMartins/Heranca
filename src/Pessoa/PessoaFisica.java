package Pessoa;

public class PessoaFisica extends Pessoa {

    private String cpf;

    private String Civil;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length()==11) {
            this.cpf = cpf;
        }
    }

    public String getCivil() {
        return Civil;
    }

    public void setCivil(String civil) {
        Civil = civil;
    }
}
