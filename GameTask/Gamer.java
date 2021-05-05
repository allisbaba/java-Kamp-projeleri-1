package GameTask;

public class Gamer extends Customer {
    private int gamerİd;
    private int level;
    private String gameName;

    public Gamer(){}

    public Gamer(int gamerİd,int level,String gameName){
        this.gamerİd = gamerİd;
        this.level = level;
        this.gameName = gameName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGamerİd() {
        return gamerİd;
    }

    public void setGamerİd(int gamerİd) {
        this.gamerİd = gamerİd;
    }
}
