package co.edu.poli.Examen1.modelo;

public class ExamenSangre extends ExamenMedico{
	
    private String rh;
    private String tipoSangre;
    
    public ExamenSangre (String codigoExamen, String nombrePaciente, String fechaRealizacion, double costoProcedimiento) {
    	super(codigoExamen, nombrePaciente, fechaRealizacion, costoProcedimiento);
        this.rh = rh;
        this.tipoSangre = tipoSangre;
    }

	public String getRh() {
		return rh;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	@Override
	public String toString() {
		return "Examen_Sangre [rh=" + rh + ", tipoSangre=" + tipoSangre + "]";
	}
    
    
}
