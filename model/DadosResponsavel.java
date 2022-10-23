
package model;

public class DadosResponsavel {
    
    private String Nome;
    private String Endere�o;
    private String Telefone;
    private String Celular;
    private String CPF;
    private String Cidade;
    private String UF;

    public DadosResponsavel(String Nome, String Endere�o, String Telefone, String Celular, String CPF, String Cidade, String UF) {
        this.Nome = Nome;
        this.Endere�o = Endere�o;
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

    public String getEndere�o() {
        return Endere�o;
    }

    public void setEndere�o(String Endere�o) {
        this.Endere�o = Endere�o;
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
