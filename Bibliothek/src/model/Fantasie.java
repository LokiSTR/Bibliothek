package model;

public class Fantasie extends Buecher{

    

    public Fantasie(int seitenanzahl, int buchnummer, int monsteranzahl, String monster) {
        super(seitenanzahl, buchnummer, monsteranzahl);
        setMonster(monster);
    }

    String _monster;
    int _monsteranzahl;

    public String genreInfo() {
        return "Es gibt:" + getMonster() + " und davon ungefähr: "  + getMonsteranzahl();
    }

    public void setMonster(String _monster) {
        this._monster = _monster;
    }
    public void setMonsteranzahl(int _monsteranzahl) {
        this._monsteranzahl = _monsteranzahl;
    }
    public String getMonster() {
        return _monster;
    }
    public int getMonsteranzahl() {
        return _monsteranzahl;
    }
    
}
