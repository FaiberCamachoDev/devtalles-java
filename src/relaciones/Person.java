package relaciones;

public class Person {
    public void calculateSum(Calculator calculator){ // relacion de dependencia Calculator es el objeto creado en y lo siguiente el nombre
        int result = calculator.add(5,3);
        System.out.println("Result sum: "+ result);
    }
}
