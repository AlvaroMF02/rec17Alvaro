package ejercicio2;

import java.util.Objects;

/**
 *
 * @author alvaro
 */
public class Municipio {
    
    //ATRIBUTOS
    private String codMunicipio;
    private String municipio;
    private String anio2016,anio2015,anio2014,anio2013,anio2011,anio2010,anio2006,anio2001,anio1996;


    //CONSTRUCTORES
    public Municipio(String codMunicipio, String municipio, String anio2016, String anio2015, String anio2014, 
            String anio2013, String anio2011, String anio2010, String anio2006, String anio2001, String anio1996) {
        this.codMunicipio = codMunicipio;
        this.municipio = municipio;
        this.anio2016 = anio2016;
        this.anio2015 = anio2015;
        this.anio2014 = anio2014;
        this.anio2013 = anio2013;
        this.anio2011 = anio2011;
        this.anio2010 = anio2010;
        this.anio2006 = anio2006;
        this.anio2001 = anio2001;
        this.anio1996 = anio1996;
    }
    public Municipio() {
    }

    //GETTERS Y SETTERS
    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getAnio2016() {
        return anio2016;
    }

    public void setAnio2016(String anio2016) {
        this.anio2016 = anio2016;
    }

    public String getAnio2015() {
        return anio2015;
    }

    public void setAnio2015(String anio2015) {
        this.anio2015 = anio2015;
    }

    public String getAnio2014() {
        return anio2014;
    }

    public void setAnio2014(String anio2014) {
        this.anio2014 = anio2014;
    }

    public String getAnio2013() {
        return anio2013;
    }

    public void setAnio2013(String anio2013) {
        this.anio2013 = anio2013;
    }

    public String getAnio2011() {
        return anio2011;
    }

    public void setAnio2011(String anio2011) {
        this.anio2011 = anio2011;
    }

    public String getAnio2010() {
        return anio2010;
    }

    public void setAnio2010(String anio2010) {
        this.anio2010 = anio2010;
    }

    public String getAnio2006() {
        return anio2006;
    }

    public void setAnio2006(String anio2006) {
        this.anio2006 = anio2006;
    }

    public String getAnio2001() {
        return anio2001;
    }

    public void setAnio2001(String anio2001) {
        this.anio2001 = anio2001;
    }

    public String getAnio1996() {
        return anio1996;
    }

    public void setAnio1996(String anio1996) {
        this.anio1996 = anio1996;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Código=" + codMunicipio + ", Municipio=" + municipio + ", 2016=" + anio2016 + ", 2015=" + anio2015 + ", 2014=" + anio2014 + ", 2013=" + anio2013 + ", 2011=" + anio2011 + ", 2010=" + anio2010 + ", 2006=" + anio2006 + ", 2001=" + anio2001 + ", 1996=" + anio1996;
    }

    //HASHCODE

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codMunicipio);
        hash = 97 * hash + Objects.hashCode(this.municipio);
        hash = 97 * hash + Objects.hashCode(this.anio2016);
        hash = 97 * hash + Objects.hashCode(this.anio2015);
        hash = 97 * hash + Objects.hashCode(this.anio2014);
        hash = 97 * hash + Objects.hashCode(this.anio2013);
        hash = 97 * hash + Objects.hashCode(this.anio2011);
        hash = 97 * hash + Objects.hashCode(this.anio2010);
        hash = 97 * hash + Objects.hashCode(this.anio2006);
        hash = 97 * hash + Objects.hashCode(this.anio2001);
        hash = 97 * hash + Objects.hashCode(this.anio1996);
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
        final Municipio other = (Municipio) obj;
        if (!Objects.equals(this.codMunicipio, other.codMunicipio)) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        if (!Objects.equals(this.anio2016, other.anio2016)) {
            return false;
        }
        if (!Objects.equals(this.anio2015, other.anio2015)) {
            return false;
        }
        if (!Objects.equals(this.anio2014, other.anio2014)) {
            return false;
        }
        if (!Objects.equals(this.anio2013, other.anio2013)) {
            return false;
        }
        if (!Objects.equals(this.anio2011, other.anio2011)) {
            return false;
        }
        if (!Objects.equals(this.anio2010, other.anio2010)) {
            return false;
        }
        if (!Objects.equals(this.anio2006, other.anio2006)) {
            return false;
        }
        if (!Objects.equals(this.anio2001, other.anio2001)) {
            return false;
        }
        return Objects.equals(this.anio1996, other.anio1996);
    }
    
    
    
}
