import java.util.ArrayList;
import java.util.List;

public class EnemyDeathSubject {
    private List<EnemyDeathObserver> observers = new ArrayList<>();

    public void addObserver(EnemyDeathObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(EnemyDeathObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String enemyName) {
        for (EnemyDeathObserver o : observers) {
            o.onEnemyDefeated(enemyName);
        }
    }
}
