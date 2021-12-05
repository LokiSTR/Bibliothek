package model;

public class Wissen extends Buecher {

    public Wissen(int seitenanzahl, int buchnummer, String thema, int informationsjahr) {
        super(seitenanzahl, buchnummer);
        setThema(thema);
        setInformationsjahr(informationsjahr);
    }

    String _thema;
    int _informationsjahr;
    
    public void setInformationsjahr(int _informationsjahr) {
        this._informationsjahr = _informationsjahr;
    }
    public void setThema(String _thema) {
        this._thema = _thema;
    }

    public int getInformationsjahr() {
        return _informationsjahr;
    }
    public String getThema() {
        return _thema;
    }

    public String genreInfo() {
        return "Das Thema dieses Werkes ist: " + getThema() + ". Es stammt aus dem Jahre: " + getInformationsjahr();
    }
    
}
