public class Alumno {
    String nombre;
    int[] calificaciones;

    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio de calificaciones
    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Promedio: " + calcularPromedio());
    }
}
