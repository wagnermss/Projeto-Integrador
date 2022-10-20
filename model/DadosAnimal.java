/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author George
 */
public class DadosAnimal {
    
    String Nome;
    String Espécie;
    String Raça;
    String Sexo;
    int Idade;
    float Peso;
    String Pelagem;
    String Procedência;

    public DadosAnimal(String Nome, String Espécie, String Raça, String Sexo, int Idade, float Peso, String Pelagem, String Procedência) {
        this.Nome = Nome;
        this.Espécie = Espécie;
        this.Raça = Raça;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.Peso = Peso;
        this.Pelagem = Pelagem;
        this.Procedência = Procedência;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEspécie() {
        return Espécie;
    }

    public void setEspécie(String Espécie) {
        this.Espécie = Espécie;
    }

    public String getRaça() {
        return Raça;
    }

    public void setRaça(String Raça) {
        this.Raça = Raça;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public String getPelagem() {
        return Pelagem;
    }

    public void setPelagem(String Pelagem) {
        this.Pelagem = Pelagem;
    }

    public String getProcedência() {
        return Procedência;
    }

    public void setProcedência(String Procedência) {
        this.Procedência = Procedência;
    }
}
