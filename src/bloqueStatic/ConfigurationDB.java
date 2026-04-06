package bloqueStatic;

public class ConfigurationDB {
    static final String URL; // final (constantes) siempre CASE
     static final String USER;

    static {
        //dentro de un bloque static, no puede haber atributos de instancia, se debe manejar variables tipo static
        URL ="url......host";
        USER ="admin";
        System.out.println("configuracion cargada");
        // se ejecutan una vez cuando se carga la clase por primera vez, y es lo primero.
        // sirve para inicializar y configurar recursos.
    }

    public static void main(String[] args) {
        System.out.println(URL);
        System.out.println(USER);
    }
}
