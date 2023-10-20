public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animales = {
            new Gatos(),
            new Perros(),
            new Lobos(),
            new Leones()
        };

        for (Animal animal : animales) {
            System.out.println(animal.getNombreCientifico());
            System.out.println("sonido: " + animal.getSonido());
            System.out.println("alimentos: " + animal.getAlimentos());
            System.out.println("habitat: " + animal.getHabitat());
            System.out.println();
        }
    }
}
