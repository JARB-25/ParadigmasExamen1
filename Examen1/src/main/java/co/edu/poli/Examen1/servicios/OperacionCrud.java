package co.edu.poli.Examen1.servicios;

import co.edu.poli.Examen1.modelo.ExamenMedico;

public interface OperacionCrud {

    String crear(ExamenMedico e);
    
    ExamenMedico leer(String codigoExamen);
    
    String actualizar(String codigoExamen, ExamenMedico e);
    
    String eliminar(String codigoExamen);
    
    ExamenMedico buscar(String codigoExamen);
    
}
