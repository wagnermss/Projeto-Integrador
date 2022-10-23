
package model;

public class AnamneseEspecial {
    
    private String SistemaRespirat�rio ;
    private String SistemaDigest�rio;
    private String SistemaCardiovascular;
    private String Urin�rio;
    private String Reprodutor;
    private String Locomotor;
    private String Neurol�gico;
    private String PeleEAnexos;
    private String Olho;
    
    
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
