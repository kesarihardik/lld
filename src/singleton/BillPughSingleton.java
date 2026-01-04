package singleton;

public class BillPughSingleton {
    private static BillPughSingleton instance;

    // Holder is not loaded in memory until getInstance() is loaded
    private static class Holder{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Holder.INSTANCE;
    }
}

// Good when resource creation is heavy.
// thread safe.