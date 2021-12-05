package model;

public class Kinder extends Buecher {

    public Kinder(int seitenanzahl, int buchnummer, int altersgruppe, boolean gutvorzulesen) {
        super(seitenanzahl, buchnummer);
        setAltersgruppe(altersgruppe);
        setGutvorzulesen(gutvorzulesen);
    }

    int _altersgruppe;
    boolean _gutvorzulesen;

    public void setAltersgruppe(int _altersgruppe) {
        this._altersgruppe = _altersgruppe;
    }
    public void setGutvorzulesen(boolean _gutvorzulesen) {
        this._gutvorzulesen = _gutvorzulesen;
    }
    public int getAltersgruppe() {
        return _altersgruppe;
    }

    public String genreInfo() {
        if(_gutvorzulesen == true){
            return "Dieses Buch eignet sich gut zum Vorlesen. Es ist für min. " + getAltersgruppe() + " freigegeben";
        }
        else {
            return "Dieses Buch eignet sich nicht so gut zum Vorlesen. Es ist für min. " + getAltersgruppe() + " freigegeben";
        }
    }

    
}
