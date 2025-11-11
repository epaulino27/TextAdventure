abstract public class Fightable {
    //initialize player variables
    int health;
    boolean isAlive;

    // Observer pattern
    private EnemyDeathSubject deathSubject = new EnemyDeathSubject();

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

    // Observer methods
    public void addDeathObserver(EnemyDeathObserver o) {
        deathSubject.addObserver(o);
    }

    public void notifyDeath(String enemyName) {
        deathSubject.notifyObservers(enemyName);
    }

    public void fight(Fightable enemy){};
}
