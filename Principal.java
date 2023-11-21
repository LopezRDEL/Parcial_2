/**
 * Clase que sera ejecutada
 */

public class Principal {
    /**
     * Primer metodo que se ejecutara en la aplicacion
     * @param args
     */
    public static void main (String [] args){

        Productos phone_X = new Productos("Phone X","Pantalla Super Retina HD, Pantalla OLED Multi-Touch de 5,8 pulgadas (diagonal) sin marco.", "100", "9" );
        Productos play_5 = new Productos("Play 5","CPU x86-64-AMD Ryzen™ Zen 2 8 nucleos/16 hilos frecuencia variable, hasta 3.5GHz", "10000","5");
        Productos appleWhatch = new Productos("Apple whatch", "Caja de acero inoxidable o de acero inoxidable en negro espacial,Cristal de zafiro. ", "10000" , "123");


        phone_X.mostrarinfo();
        play_5.mostrarinfo();
        appleWhatch.mostrarinfo();

    }

}
