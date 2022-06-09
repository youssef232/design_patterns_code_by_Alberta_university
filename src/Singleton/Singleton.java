package Singleton;

public class Singleton {
    private static Singleton uniqueInstance = null;

    private Singleton(){
        System.out.println("said is constructed");
    }
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
