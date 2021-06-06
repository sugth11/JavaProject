package multiThreading;

public class MultiThreadClass extends Thread {
    @Override
    public void run(){
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        MultiThreadClass thread = new MultiThreadClass();
        MultiThreadClass thread1 = new MultiThreadClass();
        MultiThreadClass thread2 = new MultiThreadClass();
        thread.start();
        thread1.start();
        thread2.start();
    }
}
