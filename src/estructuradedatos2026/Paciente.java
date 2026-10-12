package estructuradedatos2026;

/**
 *
 * @author eduardopadilla
 */
public class Paciente {
    //Atributos⭐︎☆
    private byte numeroSeguroSocial;
    private String nombreCompleto;
    private byte edad;
    private char sexoBiologico;
    private short glucosa;
    private long globulosRojos;
    private double temperaturaCorporal;
    private double dosisMedicamentoMl;
    private char esAlergicoPenecilina;
    
    public Paciente(byte numeroSeguroSocial, String nombreCompleto, byte edad, char sexoBiologico, short glucosa, 
            long globulosRojos, double temperaturaCorporal, double dosisMedicamentoMl, char esAlergicoPenecilina) {
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sexoBiologico = sexoBiologico;
        this.glucosa = glucosa;
        this.globulosRojos = globulosRojos;
        this.temperaturaCorporal = temperaturaCorporal;
        this.dosisMedicamentoMl = dosisMedicamentoMl;
        this.esAlergicoPenecilina = esAlergicoPenecilina;    
    }

    public byte getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(byte numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(char sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public short getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(short glucosa) {
        this.glucosa = glucosa;
    }

    public long getGlobulosRojos() {
        return globulosRojos;
    }

    public void setGlobulosRojos(long globulosRojos) {
        this.globulosRojos = globulosRojos;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public double getDosisMedicamentoMl() {
        return dosisMedicamentoMl;
    }

    public void setDosisMedicamentoMl(double dosisMedicamentoMl) {
        this.dosisMedicamentoMl = dosisMedicamentoMl;
    }

    public char getEsAlergicoPenecilina() {
        return esAlergicoPenecilina;
    }

    public void setEsAlergicoPenecilina(char esAlergicoPenecilina) {
        this.esAlergicoPenecilina = esAlergicoPenecilina;
    }
    
}
