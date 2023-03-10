/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danielcarrasco_lab7p2;

public class Archivos {
    private String nombreAr;
    private String linkAr;
    private String extensionAr;
    private double tamañoAr;

    public Archivos() {
    }

    public Archivos(String nombreAr, String linkAr, String extensionAr, double tamañoAr) {
        this.nombreAr = nombreAr;
        this.linkAr = linkAr;
        this.extensionAr = extensionAr;
        this.tamañoAr = tamañoAr;
    }

    public String getNombreAr() {
        return nombreAr;
    }

    public void setNombreAr(String nombreAr) {
        this.nombreAr = nombreAr;
    }

    public String getLinkAr() {
        return linkAr;
    }

    public void setLinkAr(String linkAr) {
        this.linkAr = linkAr;
    }

    public String getExtensionAr() {
        return extensionAr;
    }

    public void setExtensionAr(String extensionAr) {
        this.extensionAr = extensionAr;
    }

    public double getTamañoAr() {
        return tamañoAr;
    }

    public void setTamañoAr(double tamañoAr) {
        this.tamañoAr = tamañoAr;
    }

    @Override
    public String toString() {
        return "Archivos{" + "nombreAr=" + nombreAr + ", linkAr=" + linkAr + ", extensionAr=" + extensionAr + ", tama\u00f1oAr=" + tamañoAr + '}';
    }
    
    
}
