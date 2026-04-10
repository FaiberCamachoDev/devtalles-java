
public class Main {
    public static void main(String[] args) {
        double salario = 2000.0;
        System.out.println("salary: " + obtenerCategoriaSalarial(salario));
        }
    // switch expressions
    public static String obtenerCategoriaSalarial(double salario) {

        // El "return" va directo antes del switch.
        // Todo el bloque switch se evalúa y escupe el String final.
        return switch (Double.valueOf(salario)) {

            // Usamos la palabra 'when' para crear los rangos
            case Double s when s < 2000.0 -> "Junior";

            case Double s when s >= 2000.0 && s < 5000.0 -> "Senior"; // el when se usa para condiciones, como if-else if-else

            case Double s when s >= 5000.0 -> "Expert";

            // Las Switch Expressions OBLIGAN a tener un default
            default -> "Rango no válido";
        };
    }

}

