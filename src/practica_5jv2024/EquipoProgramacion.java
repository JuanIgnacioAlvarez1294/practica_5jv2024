package practica_5jv2024;

import java.util.*;


public class EquipoProgramacion extends Equipo implements Constantes {
    private ArrayList<String> programadores;

    public EquipoProgramacion(String nombreEquipo, String universidad, String lenguaje, int tamañoEquipo) {
        super(nombreEquipo, universidad, lenguaje, tamañoEquipo);
        programadores = new ArrayList<>();
    }

    public void añadirProgramador(String programador) throws IllegalStateException {
        if (programadores.size() >= getTamañoEquipo()) {
            throw new IllegalStateException("El equipo está completo, no se puede añadir más programadores.");
        }
        programadores.add(programador);
    }

    public void armarListaProgramadores(Collection<String> lista) {
        programadores.addAll(lista);
    }

    public void validarNombreApellido(String nombre) throws InputMismatchException {
        if (nombre.matches(".*\\d.*")) {
            throw new InputMismatchException("El nombre o apellido no puede contener números.");
        }
    }

    @Override
    public boolean equipoCompleto() {
        return programadores.size() == getTamañoEquipo();
    }
    
    public ArrayList<String> getProgramadores() {
        return programadores;
    }

}