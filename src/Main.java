public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();

        p1.setEdad(5);
        p1.setNombre("manolo");
        p1.setTelefono(695022344);

        System.out.println("nuestra persona se llama: " + p1.getNombre() + ",  tiene: " + p1.getEdad() + " años y su telefono es: " + p1.getTelefono());

    }
}