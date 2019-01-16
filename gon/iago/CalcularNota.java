package gon.iago;

public class CalcularNota {

    private int nota;

    public CalcularNota(int nota) {
        if ((nota > 0) && (nota <= 10)) {
            this.nota = nota;
        }

    }

    @Override
    public String toString() {
        if ((nota > 0) && (nota <= 10)) {
            return "nota=" + nota;
        } else {
            return "nota incorrecta";
        }
    }

}
