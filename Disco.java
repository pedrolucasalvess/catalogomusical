public class Disco {
    private String titulo;
    private int anoLancamento;
    private String faixas;
    private Artista artista;

    public Disco(String titulo, int anoLancamento, String faixas, Artista artista) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.faixas = faixas;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Ano: " + anoLancamento + ", Artista: " + artista +
               ", Faixas: " + faixas;
    }
}