/* El sistema debe permitir registrar un nuevo evento de inspección solicitando: 
código del pozo (ej. YOP-AGZ-017), municipio (Aguazul, Tauramena, Monterrey, Maní, Villanueva), 
tipo de evento (FUGA, MANTENIMIENTO, LECTURA_PRESION, CIERRE_TURNO), descripción y fecha-hora. 
El evento queda en el tope de la pila. */

package PARCIAL3KALETH;

public class Inspeccion {

    private String codigoPozo;
    private String municipio;
    private String tipoEvento;
    private String descripcion;
    private String fechaHora;
    
    public Inspeccion(String codigoPozo, String municipio, String tipoEvento, String descripcion, String fechaHora) {
        this.codigoPozo = codigoPozo;
        this.municipio = municipio;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
    }

    public String getCodigoPozo() {
        return codigoPozo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String toString() {
        return "Inspeccion{" +
                "codigoPozo='" + codigoPozo + '\'' +
                ", municipio='" + municipio + '\'' +
                ", tipoEvento='" + tipoEvento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                '}';
    }



}