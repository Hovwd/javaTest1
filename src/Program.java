import com.sun.deploy.util.SyncAccess;

import java.io.*;
        import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.List;
        import java.util.Objects;
        import java.util.concurrent.locks.Lock;
        import java.util.concurrent.locks.ReentrantLock;
        import java.util.function.Consumer;

/**
 * Created by developer on 21/09/2016.
 */
public class Program extends Eggs{
    private int x=2;

    Program(String a) {
        super(a);
        System.out.println(x);
    }
    public void m(){
        System.out.println(x);
    }

    public static void main(String[] args){
        new Program("a");
    }
}
abstract class Eggs{
    abstract void m();
    Eggs(String a){
        m();
    }
}





