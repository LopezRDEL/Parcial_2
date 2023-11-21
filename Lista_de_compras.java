import java.util.LinkedList;

public class Lista_de_compras {
    public LinkedList<Productos> ProductosDisponibles = new LinkedList<Productos>();

    public void registrarLibro(Productos productos){
        ProductosDisponibles.add(productos);
    }
}
