import java.util.Random;

public class WildBoar extends Fightable {
    //variables
    Random random;

    //constructor
    WildBoar(){
        this.health = 20;
        this.isAlive = true;
        this.random = new Random();
    }

    //actions
    @Override
    public void fight(Fightable player) {
        System.out.println("Wild Boar is attacking!");
        if(random.nextInt(10) + 1 > 5){
            System.out.println("Wild Boar has hit Player!");
            player.setHealth(player.health - 10);
            System.out.println("Player health at " + player.health);
            if(player.health <= 0){
                player.setStatus(false);
                System.out.println("Player has been defeated.");
            }
        }
        else{
            System.out.println("Player dodged, Wild Boar has missed!");
        }

        // notify observers when dead
        if(this.health <= 0 && this.isAlive){
            this.setStatus(false);
            notifyDeath("Wild Boar");
        }
    }
}
