public class EnemyFactory {
    public Fightable Enemy(String type){
        switch (type){
            case "water": case "Water":
                return new Kraken();
            case "forest": case "Forest":
                return new WildBoar();
            case "cave": case "Cave":
                return new GiantBat();
            default:
                System.out.println("ERROR: Unrecognized type. Please try again.");
                return null;
        }
    }
}
