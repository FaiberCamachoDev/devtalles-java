package relaciones;

public class House {
    // aqui usamos clases como atributos de otra clase... no se define los atributos directamente en esta clase.

    private Room room; // relacion de composicion con clase House --- si se destruye house se destruye la habitacion construida.
    private Door door; // relacion de composicion con clase House --- si se destruye house se destruye la habitacion construida.
    private Owner owner; // relacion asociacion owner con house - pueden existir uno independiente del otro

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}
