package co.edu.poli.Examen1.servicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.poli.Examen1.modelo.ExamenMedico;

public class ImplementacionCrud implements OperacionCrud, OperacionArchivo{
	
    private ArrayList<ExamenMedico> lista;
    
    public ImplementacionCrud() {
    	lista = new Arraylist<>();
    }
    
    @Override
    public String crear(ExamenMedico e) {
    
        for (ExamenMedico existente : lista) {
            if (existente.getCodigoExamen().equals(e.getCodigoExamen())) {
                return "Ya existe este código de Examen Médico, intente con uno diferente";
            }
        }
        lista.add(e);
        return "Examen agregado correctamente";
    }

    @Override
    public ExamenMedico leer(String codigoExamen) {
        for (ExamenMedico e : lista) {
            if (e.getCodigoExamen().equals(codigoExamen)) return e;
        }
        return null;
    }

    @Override
    public String actualizar(int codigo_Examen, ExamenMedico nuevo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigoExamen().equals(codigo_Examen)) {
                lista.set(i, nuevo);
                return "Examen actualizado";
            }
        }
        return "Examen no encontrado";
    }

    @Override
    public String eliminar(String codigoExamen) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigoExamen().equals(codigoExamen)) {
                lista.remove(i);
                return "Examen eliminado";
            }
        }
        return "Examen no encontrado";
    }

    @Override
    public ExamenMedico buscar(String codigoExamen) {
        return leer(codigoExamen);
    }


    
    @Override
    public String serializar(ArrayList<ExamenMedico> listaGuardar, String path, String name) {
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaGuardar);
            oos.close(); fos.close();
            return "Lista guardada correctamente";
        } catch (Exception e) {
            return "Error al guardar: " + e.getMessage();
        }
    }

    /** Deserializa el archivo y retorna la lista; {@code null} si falla. */
    @Override
    @SuppressWarnings("unchecked")
    public ArrayList<ExamenMedico> deserializar(String path, String name) {
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<ExamenMedico> cargada = (ArrayList<ExamenMedico>) ois.readObject();
            ois.close(); fis.close();
            return cargada;
        } catch (Exception e) {
            return null;
        }
    }
    
    public void setLista(ArrayList<ExamenMedico> lista) { this.lista = lista; }
}
