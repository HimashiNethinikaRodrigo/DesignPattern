package creational.singleton;/*
 *Singleton design pattern is mostly used in multi-threaded
 * and Database applications
 */

public class Singleton {
    // 1. static variable to store Singleton instance
    // If need early instantiation can use new Singleton() instead of null
    // Cons of earlmy instantiation :
    // exception handling is not possible,
    // instance class is crated whether it is needed or not
    private static Singleton singleton_instance = null;

    // 2. make constructor private
    private Singleton() {
    }

    //3. static method to return the object of Singleton class
    public static Singleton getInstance ()
    {
        if (singleton_instance == null)
            //This is lazy instantiation
            // instance created at request time
            // singleton property may break in multi threaded environment
            singleton_instance = new Singleton();
        return singleton_instance;
    }
}
