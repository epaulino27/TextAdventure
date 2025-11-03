public class CommandAttack implements Command{
    //Concrete Implementation of Command For the Player to Attack
    //Reciever
    Player CurPlayer;
    Fightable CurEnemy;
    //Constuctor
    CommandAttack(Player curPlayer,Fightable curEnemy){
        CurPlayer = curPlayer;
        CurEnemy  = curEnemy;
    }
    // Implementation
    @Override
    public void Execute() {
        CurPlayer.fight(CurEnemy);
    }

}
