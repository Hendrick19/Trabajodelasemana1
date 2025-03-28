
public class Persona {
    String nombre;
    int edad;

 public Persona(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;

 }
 public void saludar(){
    System.out.println("hola, mi nombre es: "+nombre+",y tengo"+edad+"años.");

 }
  // Método para cambiar el nombre
  public void cambiarNombre(String nuevoNombre) {
    nombre = nuevoNombre;
    System.out.println("Ahora me llamo " + nombre + ".");
}
public void cumplirAños() {
    edad++;
    System.out.println(nombre + " ha cumplido años y ahora tiene " + edad + " años.");
}

 public static void main(String[] args) {
    Persona personal= new Persona("hendrick",23);

    personal.saludar();
    personal.cambiarNombre("juan");
    personal.cumplirAños();

 }
}



