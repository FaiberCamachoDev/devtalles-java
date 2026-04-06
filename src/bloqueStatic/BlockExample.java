package bloqueStatic;

import java.awt.*;

public class BlockExample {
    static {
        //esto es un bloque estatico...
        System.out.println("Bloque estaitco ejecutado");
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
