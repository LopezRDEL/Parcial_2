public class Productos {/**
 * Clase productos
 */
    /**
     * atributos:
     */

    String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String descripcion ;
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    String precio ;
    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


    String cantidadesDisponibles ;
    public String getCantidadesDisponibles() {
        return cantidadesDisponibles;
    }

    public void setCantidadesDisponibles(String cantidadesDisponibles) {
        this.cantidadesDisponibles = cantidadesDisponibles;
    }


    /**
     * Constructor de la clase
     *@param nombre Nombre del producto
     *@param descripcion descripcion del producto
     *@param precio precio del producto
     *@param cantidadesDisponibles productos restantes en la tienda
     /** Complejidad temporal: O(1) Complejidad Constante
     */


    public Productos (String nombre, String descripcion, String precio, String cantidadesDisponibles){
        this. nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.cantidadesDisponibles=cantidadesDisponibles;
    }


    /**
     * Imprime frase que dice el hombre
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void mostrarinfo() {
        System.out.println("El dispositivo " + nombre + " contiene " + descripcion + "con el costo de " + precio + "Contamos con estas unidades " + cantidadesDisponibles);


    }
}

