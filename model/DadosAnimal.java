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
    String Esp�cie;
    String Ra�a;
    String Sexo;
    int Idade;
    float Peso;
    String Pelagem;
    String Proced�ncia;

    public DadosAnimal(String Nome, String Esp�cie, String Ra�a, String Sexo, int Idade, float Peso, String Pelagem, String Proced�ncia) {
        this.Nome = Nome;
        this.Esp�cie = Esp�cie;
        this.Ra�a = Ra�a;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.Peso = Peso;
        this.Pelagem = Pelagem;
        this.Proced�ncia = Proced�ncia;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEsp�cie() {
        return Esp�cie;
    }

    public void setEsp�cie(String Esp�cie) {
        this.Esp�cie = Esp�cie;
    }

    public String getRa�a() {
        return Ra�a;
    }

    public void setRa�a(String Ra�a) {
        this.Ra�a = Ra�a;
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

    public String getProced�ncia() {
        return Proced�ncia;
    }

    public void setProced�ncia(String Proced�ncia) {
        this.Proced�ncia = Proced�ncia;
    }
}
