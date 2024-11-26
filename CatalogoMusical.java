public class CatalogoMusical {
    private Disco disco;
    private Artista artista;

    public void adicionarArtista(String nome, String genero) {
        artista = new Artista(nome, genero);
        System.out.println("Artista " + nome + " adicionado!");
    }

    public void adicionarDisco(String titulo, int ano, String faixas) {
        if (artista == null) {
            System.out.println("Nenhum artista foi cadastrado. Adicione um artista antes.");
            return;
        }
        disco = new Disco(titulo, ano, faixas, artista);
        System.out.println("Disco " + titulo + " adicionado!");
    }

    public void listarDisco() {
        if (disco == null) {
            System.out.println("Nenhum disco cadastrado.");
            return;
        }
        System.out.println(disco);
    }
}