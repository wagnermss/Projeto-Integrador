/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author George
 */
public class AnamneseEspecial {
    
    String SistemaRespiratório ;
    String SistemaDigestório;
    String SistemaCardiovascular;
    String Urinário;
    String Reprodutor;
    String Locomotor;
    String Neurológico;
    String PeleEAnexos;
    String Olho;
    
    
     public AnamneseEspecial(String SistemaRespiratório, String SistemaDigestório, String SistemaCardiovascular, String Urinário, String Reprodutor, String Locomotor, String Neurológico, String PeleEAnexos, String Olho) {
        this.SistemaRespiratório = SistemaRespiratório;
        this.SistemaDigestório = SistemaDigestório;
        this.SistemaCardiovascular = SistemaCardiovascular;
        this.Urinário = Urinário;
        this.Reprodutor = Reprodutor;
        this.Locomotor = Locomotor;
        this.Neurológico = Neurológico;
        this.PeleEAnexos = PeleEAnexos;
        this.Olho = Olho;
    }
     
     public String getSistemaRespiratório() {
        return SistemaRespiratório;
    }

    public void setSistemaRespiratório(String SistemaRespiratório) {
        this.SistemaRespiratório = SistemaRespiratório;
    }

    public String getSistemaDigestório() {
        return SistemaDigestório;
    }

    public void setSistemaDigestório(String SistemaDigestório) {
        this.SistemaDigestório = SistemaDigestório;
    }

    public String getSistemaCardiovascular() {
        return SistemaCardiovascular;
    }

    public void setSistemaCardiovascular(String SistemaCardiovascular) {
        this.SistemaCardiovascular = SistemaCardiovascular;
    }

    public String getUrinário() {
        return Urinário;
    }

    public void setUrinário(String Urinário) {
        this.Urinário = Urinário;
    }

    public String getReprodutor() {
        return Reprodutor;
    }

    public void setReprodutor(String Reprodutor) {
        this.Reprodutor = Reprodutor;
    }

    public String getLocomotor() {
        return Locomotor;
    }

    public void setLocomotor(String Locomotor) {
        this.Locomotor = Locomotor;
    }

    public String getNeurológico() {
        return Neurológico;
    }

    public void setNeurológico(String Neurológico) {
        this.Neurológico = Neurológico;
    }

    public String getPeleEAnexos() {
        return PeleEAnexos;
    }

    public void setPeleEAnexos(String PeleEAnexos) {
        this.PeleEAnexos = PeleEAnexos;
    }

    public String getOlho() {
        return Olho;
    }

    public void setOlho(String Olho) {
        this.Olho = Olho;
    }
     
}
