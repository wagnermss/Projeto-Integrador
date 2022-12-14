
package model;

public class DadosResponsavel {
    
    private String Nome;
    private String Enderešo;
    private String Telefone;
    private String Celular;
    private String CPF;
    private String Cidade;
    private String UF;

    public DadosResponsavel(String Nome, String Enderešo, String Telefone, String Celular, String CPF, String Cidade, String UF) {
        this.Nome = Nome;
        this.Enderešo = Enderešo;
        this.Telefone = Telefone;
        this.Celular = Celular;
        this.CPF = CPF;
        this.Cidade = Cidade;
        this.UF = UF;
    }

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEnderešo() {
        return Enderešo;
    }

    public void setEnderešo(String Enderešo) {
        this.Enderešo = Enderešo;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
}
