package ejercicio1;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author alvaro
 */
public class Root {

    //ATRIBUTOS
    private String nombre;
    private ArrayList<String> destinos;
    private double precio;
    private int numeroNoches;
    private String puertoSalida;
    private String buque;

    //CONSTRUCTORES
    public Root(String nombre, ArrayList<String> destinos, double precio, int numeroNoches, String puertoSalida, String buque) {
        this.nombre = nombre;
        this.destinos = destinos;
        this.precio = precio;
        this.numeroNoches = numeroNoches;
        this.puertoSalida = puertoSalida;
        this.buque = buque;
    }

    public Root() {
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<String> destinos) {
        this.destinos = destinos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public String getPuertoSalida() {
        return puertoSalida;
    }

    public void setPuertoSalida(String puertoSalida) {
        this.puertoSalida = puertoSalida;
    }

    public String getBuque() {
        return buque;
    }

    public void setBuque(String buque) {
        this.buque = buque;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Viaje: " + "nombre=" + nombre + ", destinos=" + destinos + ", precio=" + precio + ", numeroNoches=" + numeroNoches + ", puertoSalida=" + puertoSalida + ", buque=" + buque;
    }

    //HASHCODE
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.destinos);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 13 * hash + this.numeroNoches;
        hash = 13 * hash + Objects.hashCode(this.puertoSalida);
        hash = 13 * hash + Objects.hashCode(this.buque);
        return hash;
    }

    //EQUALS
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Root other = (Root) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.numeroNoches != other.numeroNoches) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.puertoSalida, other.puertoSalida)) {
            return false;
        }
        if (!Objects.equals(this.buque, other.buque)) {
            return false;
        }
        return Objects.equals(this.destinos, other.destinos);
    }

}
