package singleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        System.out.println(s1 == s2);

        EnumSingleton e1 = EnumSingleton.SINGLETON;
        EnumSingleton e2 = EnumSingleton.SINGLETON;

        System.out.println(e1 == e2);
    }
}

// uses of singleton
// when to use which implementation
// thread safe implementations
// public static v/s private static? when are they loaded? synchronized vs volatile?
// how many thread safe implementation