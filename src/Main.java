public class Main {
    public static void main(String[] args) {
        // Create player
        Player player = new Player();

        // Define location, singleton
        WorldEnvironment world = WorldEnvironment.getInstance();
        world.setEnvironment("cave"); //if not set defaults to water

        // Create enemy, factory
        EnemyFactory factory = new EnemyFactory();
        Fightable enemy = factory.Enemy(world.getEnvironment()); //takes water/forest/cave

        // Enemy death check, loot observer attached
        LootSystem loot = new LootSystem();
        enemy.addDeathObserver(loot);

        // Trigger/Simulate fight, command
        CommandInvoker Button = new CommandInvoker();
        CommandAttack Attack = new CommandAttack(player, enemy);
        Button.setCurCommand(Attack);

        while(enemy.getStatus()){
            Button.executeCommand();
            System.out.println();
        }
    }
}
