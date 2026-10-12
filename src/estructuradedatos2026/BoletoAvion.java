package estructuradedatos2026;

/**
 *
 * @author eduardopadilla
 */
public class BoletoAvion {
    //Atributos⭐︎☆
    private byte numeroTicket;
    private long codigoReserva;
    private byte asientoFila;
    private char asientoLetra;
    private int distanciakm;
    private long altitud;
    private double pesoEquipajeKg;
    private long precioBoleto;
    private boolean incluyeEquipajeMano;
    
    public BoletoAvion(byte numeroTicket, long codigoReserva, byte asientoFila, char asientoLetra, int distanciakm, 
            long altitud, double pesoEquipajeKg, long precioBoleto, boolean incluyeEquipajeMano) {
        this.numeroTicket = numeroTicket;
        this.codigoReserva = codigoReserva;
        this.asientoFila = asientoFila;
        this.asientoLetra = asientoLetra;
        this.distanciakm = distanciakm;
        this.altitud = altitud;
        this.pesoEquipajeKg = pesoEquipajeKg;
        this.precioBoleto = precioBoleto;
        this.incluyeEquipajeMano = incluyeEquipajeMano;
        
    }

    public byte getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(byte numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public long getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(long codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public byte getAsientoFila() {
        return asientoFila;
    }

    public void setAsientoFila(byte asientoFila) {
        this.asientoFila = asientoFila;
    }

    public char getAsientoLetra() {
        return asientoLetra;
    }

    public void setAsientoLetra(char asientoLetra) {
        this.asientoLetra = asientoLetra;
    }

    public int getDistanciakm() {
        return distanciakm;
    }

    public void setDistanciakm(int distanciakm) {
        this.distanciakm = distanciakm;
    }

    public long getAltitud() {
        return altitud;
    }

    public void setAltitud(long altitud) {
        this.altitud = altitud;
    }

    public double getPesoEquipajeKg() {
        return pesoEquipajeKg;
    }

    public void setPesoEquipajeKg(double pesoEquipajeKg) {
        this.pesoEquipajeKg = pesoEquipajeKg;
    }

    public long getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(long precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public boolean isIncluyeEquipajeMano() {
        return incluyeEquipajeMano;
    }

    public void setIncluyeEquipajeMano(boolean incluyeEquipajeMano) {
        this.incluyeEquipajeMano = incluyeEquipajeMano;
    }
}
