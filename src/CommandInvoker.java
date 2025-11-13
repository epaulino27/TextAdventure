public class CommandInvoker {
    //Invoker
    //Command Object
    Command CurCommand;
    //Setter Command
    public void setCurCommand(Command next) {
        CurCommand = next;
    }
    //Execute cur Command
    void executeCommand(){
        CurCommand.Execute();
    }
}
