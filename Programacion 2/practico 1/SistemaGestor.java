/**
 * Clase SistemaGestor encargada de centralizar la configuración del entorno.
 * Esta clase demuestra el uso de documentación Javadoc para metadatos.
 * * @author Agustín Alaniz
 * @version 1.0
 */

public class SistemaGestor {

    /* BLOQUE DE CONFIGURACIÓN:
    Aquí se definen las constantes globales del sistema.
    Se utiliza 'static' para que la variable pertenezca a la clase y no a la instancia,
    ahorrando memoria al no replicarse en cada objeto.
    */
    public static final int MAX_CONEXIONES = 10; // Constante de límite de red
    

    public static void main(String[] args) {
        // Creación de una instancia de SistemaGestor
        SistemaGestor gestor = new SistemaGestor();
        gestor.mostrarConfiguracion();
    }

    public void mostrarConfiguracion() {
        // Variable local para el contexto del método
        int tiempoEspera = 5000; 
        
        System.out.println("Máximo de conexiones permitidas: " + MAX_CONEXIONES);
    }

}
