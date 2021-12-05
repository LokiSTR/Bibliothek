package model;

public abstract class Buecher {
    
    public Buecher(int seitenanzahl, int buchnummer){
        setSeitenanzahl(seitenanzahl);
        setBuchnummer(buchnummer);
    }

    public Buecher(int seitenanzahl, int buchnummer, int monsteranzahl){
        setSeitenanzahl(seitenanzahl);
        setBuchnummer(buchnummer);
        setMonsteranzahl(monsteranzahl);
    }


    public abstract String genreInfo();


    int _seitenanzahl;
    int _buchnummer;
    int _monsteranzahl;

    public void setSeitenanzahl(int _seitenanzahl) {
        this._seitenanzahl = _seitenanzahl;
    }
    public void setBuchnummer(int _buchnummer) {
        this._buchnummer = _buchnummer;
    }
    public void setMonsteranzahl(int _monsteranzahl) {
        this._monsteranzahl = _monsteranzahl;
    }
    public int getSeitenanzahl() {
        return _seitenanzahl;
    }
    public int getBuchnummer() {
        return _buchnummer;
    }
    public int getMonsteranzahl() {
        return _monsteranzahl;
    }

}
