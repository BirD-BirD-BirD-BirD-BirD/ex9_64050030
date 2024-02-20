//64050030 Kitipum Nornua
public abstract class Game{

    public Game(){
        
    }

    protected abstract void initialize();
	protected abstract void play();
	protected abstract void showResult();

    public final void launch(){
        initialize();
        play();
        showResult();
    }
}