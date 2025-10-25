abstract public class Fightable {
    //initialize player variables
    int health;
    boolean isAlive;

    //getters
    public int getHealth() {
        return this.health;
    }
    public boolean getStatus() {
        return isAlive;
    }

    //setters
    public void setHealth(int health) {
        this.health = health;
    }
    public void setStatus(boolean status) {
        this.isAlive = status;
    }

    public void fight(Fightable enemy){};
}
