/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author George
 */
public class AnamneseGeral {
    
    String QueixaPrincipal;
    String HistóricoPregresso;
    String Alimentação;
    String Contactantes;
    String Ambiente;
    String Vacinação;
    String Vermifugação;
    
    
  public AnamneseGeral(String QueixaPrincipal, String HistóricoPregresso, String Alimentação, String Contactantes, String Ambiente, String Vacinação, String Vermifugação) {
        this.QueixaPrincipal = QueixaPrincipal;
        this.HistóricoPregresso = HistóricoPregresso;
        this.Alimentação = Alimentação;
        this.Contactantes = Contactantes;
        this.Ambiente = Ambiente;
        this.Vacinação = Vacinação;
        this.Vermifugação = Vermifugação;
    }
  
  public String getQueixaPrincipal() {
        return QueixaPrincipal;
    }

    public void setQueixaPrincipal(String QueixaPrincipal) {
        this.QueixaPrincipal = QueixaPrincipal;
    }

    public String getHistóricoPregresso() {
        return HistóricoPregresso;
    }

    public void setHistóricoPregresso(String HistóricoPregresso) {
        this.HistóricoPregresso = HistóricoPregresso;
    }

    public String getAlimentação() {
        return Alimentação;
    }

    public void setAlimentação(String Alimentação) {
        this.Alimentação = Alimentação;
    }

    public String getContactantes() {
        return Contactantes;
    }

    public void setContactantes(String Contactantes) {
        this.Contactantes = Contactantes;
    }

    public String getAmbiente() {
        return Ambiente;
    }

    public void setAmbiente(String Ambiente) {
        this.Ambiente = Ambiente;
    }

    public String getVacinação() {
        return Vacinação;
    }

    public void setVacinação(String Vacinação) {
        this.Vacinação = Vacinação;
    }

    public String getVermifugação() {
        return Vermifugação;
    }

    public void setVermifugação(String Vermifugação) {
        this.Vermifugação = Vermifugação;
    }
  
    
}
