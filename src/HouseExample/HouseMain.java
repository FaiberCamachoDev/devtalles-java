package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House(); // el constructor "House" inicial, siempre es el nombre de la clase que queremos usar.
        // constructor vacio, House(); (no tiene parametros)
        myHouse.setDoors(2);
        myHouse.setWindows(4);
        myHouse.setSize(10);

        House myHouse2 = new House(8,20,4);// el constructor "House" inicial, siempre es el nombre de la clase que queremos usar.
        // 2 objetos creados myH1 & myH2.
        System.out.println("The number of windows in the house are: "+ myHouse2.getWindows());
        myHouse2.openDoor();

        double area = myHouse2.calculateArea();
        System.out.println("The area of the HQ is: " + area);


    }
}
