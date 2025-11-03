public class WorldEnvironment {
    private static WorldEnvironment instance;

    public static String environment;

    public WorldEnvironment(String environment) {
        this.environment = environment;
    }
    public static WorldEnvironment getInstance(String environment) {
        if (instance == null) { //check 1
            synchronized (WorldEnvironment.class) { //check 2
                if (instance == null) {//check 3
                    //failsafe
                    try {
                        Thread.sleep(100); //check this long if it works
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //make new if needed
                    instance = new WorldEnvironment(environment);
                }
            }
        }   //finally get the instance that either already existed or was just created
        return instance;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    public String getEnvironment() {
        return environment;
    }
    public static Fightable makeEnemy(){
        EnemyFactory factory = new EnemyFactory();
        return factory.Enemy(environment);
    }

}


