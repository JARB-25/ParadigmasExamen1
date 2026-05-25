package co.edu.poli.Examen1.modelo;

public class ExamenrayosX extends ExamenMedico{
	
	private String zonaCuerpo = zonaCuerpo;
	private String nivelRadiacion = nivelRadiacion;
	
    public ExamenrayosX (String codigoExamen, String nombrePaciente, String fechaRealizacion, double costoProcedimiento) {
    	super(codigoExamen, nombrePaciente, fechaRealizacion, costoProcedimiento);
        this.zonaCuerpo = zonaCuerpo;
        this.nivelRadiacion = nivelRadiacion;
    }

	public String getZonaCuerpo() {
		return zonaCuerpo;
	}

	public void setZonaCuerpo(String zonaCuerpo) {
		this.zonaCuerpo = zonaCuerpo;
	}

	public String getNivelRadiacion() {
		return nivelRadiacion;
	}

	public void setNivelRadiacion(String nivelRadiacion) {
		this.nivelRadiacion = nivelRadiacion;
	}

	@Override
	public String toString() {
		return "Examen_rayosX [zonaCuerpo=" + zonaCuerpo + ", nivelRadiacion=" + nivelRadiacion + "]";
	}
    
    

}
