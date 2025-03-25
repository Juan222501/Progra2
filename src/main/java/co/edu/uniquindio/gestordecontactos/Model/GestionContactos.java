package co.edu.uniquindio.gestordecontactos.Model;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class GestionContactos {
    private final List<contacto>contacto;
    public GestionContactos(){
        contacto = new ArrayList<>();


    }
    public void agregarContacto(String nombre, String apellido, String telefono, LocalDate cumpleaños, String email, File imagen) throws Exception {

        if(nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty()|| cumpleaños==null|| email.isEmpty() || apellido())
            throw new Exception("Todos los campos son obligatorios");

        Contacto contacto = contacto.builder()
                .nombre(nombre)
                .apellido(apellido)
                .telefono(telefono)
                .email(email)
                .imagen(imagen);

        contacto.add(contacto);
    }
    public void eliminarContato(String nombre) throws Exception{
        int posNota = obtenerContacto(nombre);

        if(nombre==null){
            throw new Exception("No existe el id proporcionado");
        }

        contacto.remove( contacto.get(nombre) );
    }
}
//ejemplo
