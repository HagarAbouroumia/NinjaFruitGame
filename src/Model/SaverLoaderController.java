
package Model;


public class SaverLoaderController {
    
    private Command command;
    
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
    
}
