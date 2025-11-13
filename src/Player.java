import java.util.Random;

public class Player extends Fightable {
    //initialize player variables
    int score;
    Random random;

    //constructor with extended variables from Fightable
    Player(){
        this.score = 0;
        this.health = 100;
        this.isAlive = true;
        this.random = new Random();
    }

    //getters
    public int getScore(){
        return this.score;
    }

    //setters
    public void setScore(int Score){
        this.score = Score;
    }

    //actions
    @Override
    public void fight(Fightable enemy) {
        System.out.println("Player is attacking!");
        if(random.nextInt(10) + 1 > 5){
            System.out.println("Player has hit the enemy!");
            score += 5;
            enemy.setHealth(enemy.health - 10);
            System.out.println("Enemy health at " + enemy.health);
            if(enemy.health <= 0){
                enemy.setStatus(false);

                // notify observers when enemy dies
                enemy.notifyDeath(enemy.getClass().getSimpleName());
            }
        }
        else{
            System.out.println("Enemy dodged, Player has missed!");
        }
    }
}
