public class Productos {/**
 * Clase productos
 */
    /**
     * atributos:
     */
    String nombre;

    String descripcion ;

    String precio ;
    String cantidadesDisponibles ;

    /**
     * Constructor de la clase
     *@param nombre Nombre del producto
     *@param descripcion descripcion del producto
     *@param precio precio del producto
     *@param cantidadesDisponibles productos restantes en la tienda
     */
    public Productos (String nombre, String descripcion, String precio, String cantidadesDisponibles){
        this. nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.cantidadesDisponibles=cantidadesDisponibles;
    }

    /**
     * Imprime frase que dice el hombre
     */
    void mostrarinfo() {
        System.out.println("El dispositivo " + nombre + " contiene " + descripcion + "con el costo de " + precio + "Contamos con estas unidades " + cantidadesDisponibles);


    }
}

