package ejercicioscajanegra.ejercicioexcursion;

public class Excursion {
    private int numeroAlumnos;

    public Excursion(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }
    // métodos de instancia:

    public double calcularPrecioAlumno(){

        double precioPorAlumno = 0;
        if (numeroAlumnos >= 100){
            precioPorAlumno = 65;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
            precioPorAlumno = 70;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49 ) {
            precioPorAlumno = 95;
        } else {
            precioPorAlumno = 4000 / numeroAlumnos;
        }

        return precioPorAlumno;
    }



    public double calcularCosteExcursion(){

        double costeTotal = 0;
        if (numeroAlumnos >= 100){
            costeTotal = numeroAlumnos * 65;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
            costeTotal = numeroAlumnos * 70;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49 ) {
            costeTotal = numeroAlumnos * 95;
        } else {
            costeTotal = 4000;
        }
        return costeTotal;

    }
}
