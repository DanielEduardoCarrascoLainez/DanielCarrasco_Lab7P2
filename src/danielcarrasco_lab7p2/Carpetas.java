/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danielcarrasco_lab7p2;

import java.util.ArrayList;

public class Carpetas {
    private String nombreCa;
    private String linkCa;
    private ArrayList <Archivos> archivosLista= new ArrayList();
    private ArrayList <Carpetas> carpetasLista= new ArrayList();

    public Carpetas() {
    }

    public Carpetas(String nombreCa, String linkCa) {
        this.nombreCa = nombreCa;
        this.linkCa = linkCa;
    }

    public String getNombreCa() {
        return nombreCa;
    }

    public void setNombreCa(String nombreCa) {
        this.nombreCa = nombreCa;
    }

    public String getLinkCa() {
        return linkCa;
    }

    public void setLinkCa(String linkCa) {
        this.linkCa = linkCa;
    }

    public ArrayList<Archivos> getArchivosLista() {
        return archivosLista;
    }

    public void setArchivosLista(ArrayList<Archivos> archivosLista) {
        this.archivosLista = archivosLista;
    }

    public ArrayList<Carpetas> getCarpetasLista() {
        return carpetasLista;
    }

    public void setCarpetasLista(ArrayList<Carpetas> carpetasLista) {
        this.carpetasLista = carpetasLista;
    }

    @Override
    public String toString() {
        return "Carpetas{" + "nombreCa=" + nombreCa + ", linkCa=" + linkCa + ", archivosLista=" + archivosLista + ", carpetasLista=" + carpetasLista + '}';
    }
    
    
}
