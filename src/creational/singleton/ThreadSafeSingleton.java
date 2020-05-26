package creational.singleton;

public class ThreadSafeSingleton {
    // 1. static variable to store Singleton instance
    private static ThreadSafeSingleton singleton_instance = null;

    // 2. make constructor private
    private ThreadSafeSingleton() {
    }

    //3. static method to return the object of Singleton class
    //Synchronized method
    //In multi threaded environment slow performance
    // as threads can´t access this method simultaneously
    synchronized public static ThreadSafeSingleton getInstance ()
    {
        if (singleton_instance == null)
            singleton_instance = new ThreadSafeSingleton();
        return singleton_instance;
    }
}

