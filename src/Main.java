//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Kraken enemy = new Kraken();

        //previous Fight Before Command Implementation
        // player.fight(enemy);

        CommandInvoker Button =new CommandInvoker();
        CommandAttack Attack =new CommandAttack(player,enemy);

        Button.setCurCommand(Attack);
        Button.executeCommand();


    }
}