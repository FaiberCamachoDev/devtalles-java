package atributoStatic;

public class roomMain {
    public static void main(String[] args) {
        classroom student1 = new classroom("maria");
        classroom student2 = new classroom("felipe");

        student1.showInfo();
        student2.showInfo();

        classroom.setSchoolName("Escuela 2");
        student1.showInfo();
        student2.showInfo();
    }
}
