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
    
    String SistemaRespirat�rio ;
    String SistemaDigest�rio;
    String SistemaCardiovascular;
    String Urin�rio;
    String Reprodutor;
    String Locomotor;
    String Neurol�gico;
    String PeleEAnexos;
    String Olho;
    
    
     public AnamneseEspecial(String SistemaRespirat�rio, String SistemaDigest�rio, String SistemaCardiovascular, String Urin�rio, String Reprodutor, String Locomotor, String Neurol�gico, String PeleEAnexos, String Olho) {
        this.SistemaRespirat�rio = SistemaRespirat�rio;
        this.SistemaDigest�rio = SistemaDigest�rio;
        this.SistemaCardiovascular = SistemaCardiovascular;
        this.Urin�rio = Urin�rio;
        this.Reprodutor = Reprodutor;
        this.Locomotor = Locomotor;
        this.Neurol�gico = Neurol�gico;
        this.PeleEAnexos = PeleEAnexos;
        this.Olho = Olho;
    }
     
     public String getSistemaRespirat�rio() {
        return SistemaRespirat�rio;
    }

    public void setSistemaRespirat�rio(String SistemaRespirat�rio) {
        this.SistemaRespirat�rio = SistemaRespirat�rio;
    }

    public String getSistemaDigest�rio() {
        return SistemaDigest�rio;
    }

    public void setSistemaDigest�rio(String SistemaDigest�rio) {
        this.SistemaDigest�rio = SistemaDigest�rio;
    }

    public String getSistemaCardiovascular() {
        return SistemaCardiovascular;
    }

    public void setSistemaCardiovascular(String SistemaCardiovascular) {
        this.SistemaCardiovascular = SistemaCardiovascular;
    }

    public String getUrin�rio() {
        return Urin�rio;
    }

    public void setUrin�rio(String Urin�rio) {
        this.Urin�rio = Urin�rio;
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

    public String getNeurol�gico() {
        return Neurol�gico;
    }

    public void setNeurol�gico(String Neurol�gico) {
        this.Neurol�gico = Neurol�gico;
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
