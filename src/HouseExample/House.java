package HouseExample;

public class House {
    private int doors;
    private int windows;
    private double size;  // todo estos son los atributos de la clase, en este caso House.
    //<---- numero de puertas, numero de ventanas y tamano.


    public House() {
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //constructores de clase, esto permite pasar a HouseMain los parametros directamente para inicializar
    public House(int windows, double size, int doors) {
        this.windows = windows; //this se refiere al objeto actual de la clase en que se encuentra
        this.size = size;
        this.doors = doors;
    }

    //metodo es un algoritmo que realiza una tarea en especifica.
    public void openDoor(){
        System.out.println("The door is open.");
    }

    public double calculateArea(){
        return size * size;
    }

}
// por defecto hay un constructor vacio cuando nosotros creamos una clase
/*
* modificadores de acceso: controlan de que forma
* se puede acceder a los atributos, estan, protected, private y public*/