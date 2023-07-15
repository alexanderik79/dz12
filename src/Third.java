import java.util.concurrent.Callable;

public class Third implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("third");
        return null;
    }
}
