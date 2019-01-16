package boletin18;

import gon.iago.CalcularNota;
import gon.iago.Persoal;

public class Academia {

    private static int numReferencia = 2018 - 1;
    private String nome;
    private CalcularNota nota;
    private Persoal alum;

    public Academia() {
        this.numReferencia++;
    }

    public Academia(String nome, CalcularNota nota, Persoal alum) {
        this.nome = nome;
        this.alum = alum;
        this.nota = nota;
        this.numReferencia++;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academia.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CalcularNota getNota() {
        return nota;
    }

    public void setNota(CalcularNota nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Academia{ " + "numReferencia= " + numReferencia + ", nome= " + nome + ", " + nota + ", " + alum.toString() + '}';
    }

}
