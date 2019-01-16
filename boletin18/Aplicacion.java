package boletin18;

import gon.iago.CalcularNota;
import gon.iago.Persoal;

public class Aplicacion {

    public static void main(String[] args) {
        Persoal alumno = new Persoal(625142145, "correo@gmail.com");
        CalcularNota nota = new CalcularNota(6);
        Academia datos = new Academia("Carlos", nota, alumno);

        System.out.println(datos.toString());
    }

}
