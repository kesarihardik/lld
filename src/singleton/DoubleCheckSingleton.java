package singleton;

public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        // synchronize only if instance is null to reduce overhead
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

/*
 used to improve performance in multithreaded apps
 using synchronized reduces performance significantly
 */
