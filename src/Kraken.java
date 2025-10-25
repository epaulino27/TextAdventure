import java.util.Random;

public class Kraken extends Fightable {
    //variables
    Random random;

    //constructor
    Kraken(){
        this.health = 20;
        this.isAlive = true;
        this.random = new Random();
    }

    //actions
    @Override
    public void fight(Fightable player) {
        System.out.println("Kraken is attacking!");
        if(random.nextInt(10) + 1 > 5){
            System.out.println("Kraken has hit Player!");
            player.setHealth(player.health - 10);
            System.out.println("Player health at " + player.health);
            if(player.health <= 0){
                player.setStatus(false);
                System.out.println("Player has been defeated.");
            }
        }
        else{
            System.out.println("Player dodged, Kraken has missed!");
        }
    }
}
