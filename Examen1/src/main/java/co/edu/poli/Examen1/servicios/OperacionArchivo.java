package co.edu.poli.Examen1.servicios;

import co.edu.poli.Examen1.modelo.ExamenMedico;
import java.util.ArrayList;

public interface OperacionArchivo {

    String serializar(ArrayList<ExamenMedico> lista, String path, String name);
    ArrayList<ExamenMedico> deserializar(String path, String name);
    
}
