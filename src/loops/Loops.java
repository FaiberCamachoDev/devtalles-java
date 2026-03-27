package loops;

public class Loops {
    public static void main(String[] args) {

        // implementacion de buenas practicas en Loops, same way that contionals
        final int MAX_COUNT = 5;
        // for
        for(int currentNumber = 0; currentNumber <MAX_COUNT; currentNumber++){ // (declaracion/inicializacion; condicion; contador)
           System.out.println("valor: " + currentNumber);
        }
        //while
        int counter = 0;
        int acumulator = 0;
        while (counter < 5){
            System.out.println("counter: "+ counter);
            counter++; // counter here acumulator is 15
            acumulator = acumulator + counter;
            counter++; // counter here acumulator is 10
        }
        System.out.println("acumulator: " + acumulator);

        // do while
        int counter2=0;
        do { // esto ejecuta el bucle sin necesidad de validar una condicion, y repite la ejecucion mientras: while(condition)
            // y si directamente no cumple la condicion en la primera vuelta, da la respuesta de la primera vuelta y sale.
            // se ejecuta por lo menos 1 vez aunque la condicion sea false.
            System.out.println("counter2: " + counter2);
            counter2++;
        }while (counter2<5);
    }
}
