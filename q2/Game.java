//64050030 Kitipum Nornua
public abstract class Game{
    protected abstract void initialize();
    protected abstract void play();
    protected abstract void showResult();

    public void launch(){
        initialize();
        play();
        showResult();
    }
}
