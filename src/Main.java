//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WorldEnvironment singleton = new WorldEnvironment;
        Player player = new Player();
        Kraken enemy = new Kraken();

        player.fight(enemy);
    }
}
