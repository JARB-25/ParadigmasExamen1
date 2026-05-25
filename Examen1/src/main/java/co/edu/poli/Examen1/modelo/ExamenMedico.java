package co.edu.poli.Examen1.modelo;

public abstract class ExamenMedico implements Serializable{
	
    private String codigoExamen;
    private String nombrePaciente;
    private String fechaRealizacion; 
    private double costoProcedimiento;
    
    public ExamenMedico (String codigoExamen, String nombrePaciente, String fechaRealizacion, double costoProcedimiento) {
    	this.codigoExamen = codigoExamen;
    	this.nombrePaciente = nombrePaciente;
    	this.fechaRealizacion = fechaRealizacion;
    	this.costoProcedimiento = costoProcedimiento;
    }



	public String getCodigoExamen() {
		return codigoExamen;
	}

	public void setCodigoExamen(String codigoExamen) {
		this.codigoExamen = codigoExamen;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getFechaRealizacion() {
		return fechaRealizacion;
	}

	public void setFechaRealizacion(String fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}

	public double getCostoProcedimiento() {
		return costoProcedimiento;
	}

	public void setCostoProcedimiento(double costoProcedimiento) {
		this.costoProcedimiento = costoProcedimiento;
	}

	@Override
	public String toString() {
		return "Examen [codigoExamen=" + codigoExamen + ", nombrePaciente=" + nombrePaciente + ", fechaRealizacion="
				+ fechaRealizacion + ", costoProcedimiento=" + costoProcedimiento + "]";
	}
    
    
}
