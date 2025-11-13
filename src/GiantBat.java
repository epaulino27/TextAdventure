import java.util.Random;

public class GiantBat extends Fightable {
    //variables
    Random random;

    //constructor
    GiantBat(){
        this.health = 20;
        this.isAlive = true;
        this.random = new Random();
    }

    //actions
    @Override
    public void fight(Fightable player) {
        System.out.println("Giant Bat is attacking!");
        if(random.nextInt(10) + 1 > 5){
            System.out.println("Giant Bat has hit Player!");
            player.setHealth(player.health - 10);
            System.out.println("Player health at " + player.health);
            if(player.health <= 0){
                player.setStatus(false);
            }
        }
        else{
            System.out.println("Player dodged, Giant Bat has missed!");
        }

        // notify observers when dead
        if(this.health <= 0 && this.isAlive){
            this.setStatus(false);
            notifyDeath("Giant Bat");
        }
    }
}
