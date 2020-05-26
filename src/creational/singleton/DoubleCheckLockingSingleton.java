package creational.singleton;

public class DoubleCheckLockingSingleton {
    // 1. static variable to store Singleton instance
    private static DoubleCheckLockingSingleton singleton_instance = null;

    // 2. make constructor private
    private DoubleCheckLockingSingleton() {
    }

    //3. static method to return the object of Singleton class
    public static DoubleCheckLockingSingleton getInstance ()
    {
        if (singleton_instance == null)
            // synchronized block to synchronized instance
            // rather than synchronized whole method
            // efficient than method in ThreadSafeSingleton
            synchronized (DoubleCheckLockingSingleton.class) {
                if (singleton_instance == null)
                    singleton_instance = new DoubleCheckLockingSingleton();
            }
        return singleton_instance;
    }
}
