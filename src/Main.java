
public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de calificaciones
        int[] calificaciones = {8, 9, 7, 10, 6};

        // Crear un objeto Alumno
        Alumno alumno1 = new Alumno("Hendrick", calificaciones);

        // Mostrar información del alumno
        alumno1.mostrarInfo();
    }
}

