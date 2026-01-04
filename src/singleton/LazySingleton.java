package singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){};

    public static LazySingleton getInstance() {
        // Load class only when needed
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

// Use when resource is lightweight & in single threaded apps.