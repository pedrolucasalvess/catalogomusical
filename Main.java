public class Main {
    public static void main(String[] args) {
        CatalogoMusical catalogo = new CatalogoMusical();

        catalogo.adicionarArtista("Drake", "Hip-Hop");

        catalogo.adicionarDisco("Views", 2016, "Hotline Bling, One Dance, Controlla");

        System.out.println("\n--- Disco no catálogo ---");
        catalogo.listarDisco();
    }
}