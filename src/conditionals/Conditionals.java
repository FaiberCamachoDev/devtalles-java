package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        int age = 18;
        double average = 7.5;
        // buenas practicas del if
        boolean isAdult = age >= 18;
        boolean hasPassingGreat = average >= 7;
        /*
        se guardan las validaciones en un bool que devuelve true or false
        dependiendo si se cumple o no, y se reemplaza los parametros
        en los condicionales, asi si cambio la mayoria de edad
        solo modificamos la variable donde se guarda la validacion
        y asi mismo servira en toda parte que este la variable,
        se cambio una variable que afecta todo lugar donde se use ej: isAdult*/
        if (isAdult && hasPassingGreat){
            System.out.println("the student check all the conditions");
        }
        if (!isAdult){
            System.out.println("Not is an adult"); // cuando no se cumpla la condicion == false se ejecuta esta
        }

        int day = 30;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Holi juasjuas");
        }

    }
}
