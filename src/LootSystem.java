import java.util.Random;

public class LootSystem implements EnemyDeathObserver {
    Random random = new Random();

    @Override
    public void onEnemyDefeated(String enemyName) {
        System.out.println("The " + enemyName + " has been defeated!");
        int drop = random.nextInt(3);

        switch (drop) {
            case 0:
                System.out.println("Loot Drop: Player found gold coins!");
                break;
            case 1:
                System.out.println("Loot Drop: Player discovered a health potion!");
                break;
            case 2:
                System.out.println("Loot Drop: Player found a rare gem!");
                break;
        }
        System.out.println();
    }
}
