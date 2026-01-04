package singleton;

public class EagerSingleton {

    // Load instance in JVM at startup/ class-loading
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){};

    public static EagerSingleton getInstance(){
        return instance;
    }
}

// Use when object is definitely needed.
// Not ideal if singleton is resource intensive and not always required.