package com.example.adi.clientes.clases;

/**
 * Created by Adi on 24/09/2017.
 */

public class PersonajesVo {

    private String nombre;
    private String info;
    private int imagenId;

    public PersonajesVo(String nombre, String info, int imagenId) {
        this.nombre = nombre;
        this.info = info;
        this.imagenId = imagenId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImagenId() {
        return imagenId;
    }

    public void setImagenId(int imagenId) {
        this.imagenId = imagenId;
    }
}
