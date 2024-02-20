//64050030 Kitipum Nornua
public class BasketballGame extends Game{
    public BasketballGame(){

    }

    @Override
    protected void initialize() {
        System.out.println("Initalizing basketball game...");
    }

    @Override
    protected void play() {
        System.out.println("Playing basketball game...");
    }

    @Override
    protected void showResult() {
        System.out.println("Showing the results for the basketball game...");
    }
}
