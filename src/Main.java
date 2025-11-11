public class Main {
    public static void main(String[] args) {
        // Create player and enemy
        Player player = new Player();
        Kraken enemy = new Kraken();

        // Create and attach LootSystem observer
        LootSystem loot = new LootSystem();
        enemy.addDeathObserver(loot);

        // Use Command pattern to execute attack
        CommandInvoker Button = new CommandInvoker();
        CommandAttack Attack = new CommandAttack(player, enemy);

        Button.setCurCommand(Attack);
        Button.executeCommand();

        Button.setCurCommand(Attack);
        Button.executeCommand();
    }
}
