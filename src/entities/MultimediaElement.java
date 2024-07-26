package entities;

public abstract class MultimediaElement {
    protected String titolo;


    public MultimediaElement(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        titolo = titolo;
    }
}
