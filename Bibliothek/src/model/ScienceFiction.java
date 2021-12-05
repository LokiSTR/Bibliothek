package model;

public class ScienceFiction extends Buecher {



    public ScienceFiction(int seitenanzahl, int buchnummer, int monsteranzahl, boolean interstellar) {
        super(seitenanzahl, buchnummer, monsteranzahl);
        setInterstellar(interstellar);
    }


    boolean _interstellar;

    
    public void setInterstellar(boolean _interstellar) {
        this._interstellar = _interstellar;
    }
    


    public String genreInfo() {
        if(_interstellar == true){
            return "Die Zivilisation ist interstellar!";
        }
        else {
            return "Die Zivilisation ist nicht interstellar!";
        }
    }
}
