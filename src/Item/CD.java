package Item;

public class CD extends Midia{
    private int faixas;

    private String artista;

    private String album;

    public CD(){

    }
    public CD(int faixas,String artista,String album){
        setAlbum(album);
        setArtista(artista);
        setFaixas(faixas);
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        if (faixas>=1) {
            this.faixas = faixas;
        }
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if(artista.length()>0) {
            this.artista = artista;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        if(album.length()>0){
            this.album = album;
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CD{");
        sb.append("faixas=").append(faixas);
        sb.append(", artista='").append(artista).append('\'');
        sb.append(", album='").append(album).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
