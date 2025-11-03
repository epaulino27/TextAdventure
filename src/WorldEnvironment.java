public class WorldEnvironment {
    private static WorldEnvironment instance;

    private static String environment;

    private WorldEnvironment() {
        this.environment = "water"; //default

    }
    public static WorldEnvironment getInstance() {
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
                    instance = new WorldEnvironment();
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
    

}



