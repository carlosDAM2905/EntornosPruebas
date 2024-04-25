package ejercicioscajanegra.ejercicioexcursion;

public class ExcursionMetodosEstaticos {
    public static double calcularPrecioAlumno(int numeroAlumnos){
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

    public static double calcularCosteExcursion(int numeroAlumnos){
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
