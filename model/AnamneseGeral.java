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
    String Hist�ricoPregresso;
    String Alimenta��o;
    String Contactantes;
    String Ambiente;
    String Vacina��o;
    String Vermifuga��o;
    
    
  public AnamneseGeral(String QueixaPrincipal, String Hist�ricoPregresso, String Alimenta��o, String Contactantes, String Ambiente, String Vacina��o, String Vermifuga��o) {
        this.QueixaPrincipal = QueixaPrincipal;
        this.Hist�ricoPregresso = Hist�ricoPregresso;
        this.Alimenta��o = Alimenta��o;
        this.Contactantes = Contactantes;
        this.Ambiente = Ambiente;
        this.Vacina��o = Vacina��o;
        this.Vermifuga��o = Vermifuga��o;
    }
  
  public String getQueixaPrincipal() {
        return QueixaPrincipal;
    }

    public void setQueixaPrincipal(String QueixaPrincipal) {
        this.QueixaPrincipal = QueixaPrincipal;
    }

    public String getHist�ricoPregresso() {
        return Hist�ricoPregresso;
    }

    public void setHist�ricoPregresso(String Hist�ricoPregresso) {
        this.Hist�ricoPregresso = Hist�ricoPregresso;
    }

    public String getAlimenta��o() {
        return Alimenta��o;
    }

    public void setAlimenta��o(String Alimenta��o) {
        this.Alimenta��o = Alimenta��o;
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

    public String getVacina��o() {
        return Vacina��o;
    }

    public void setVacina��o(String Vacina��o) {
        this.Vacina��o = Vacina��o;
    }

    public String getVermifuga��o() {
        return Vermifuga��o;
    }

    public void setVermifuga��o(String Vermifuga��o) {
        this.Vermifuga��o = Vermifuga��o;
    }
  
    
}
