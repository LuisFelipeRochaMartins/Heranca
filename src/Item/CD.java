package Item;

public class CD extends Midia{
    private int faixas;

    private String artista;

    private String album;

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
}
