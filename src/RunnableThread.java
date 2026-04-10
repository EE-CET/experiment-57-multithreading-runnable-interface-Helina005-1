

// Create a class that implements the Runnable interface
class MyRunnable implements Runnable {
    // Implement the run() method
    @Override
    public void run() {
        // Print numbers from 1 to 5, space-separated as shown in the example
        for (int i = 1; i <= 5; i++) {
            // Using print instead of println to keep them on the same line
            if (i == 5) {
                System.out.print(i); // No trailing space for the last number
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing
    }
}


public class RunnableThread {

    public static void main(String[] args) {
        // 1. Create an instance of your Runnable class
        MyRunnable myRunnable = new MyRunnable();
        
        // 2. Create a Thread object, passing your Runnable instance to its constructor
        Thread thread = new Thread(myRunnable);
        
        // 3. Start the thread
        thread.start();
    }
}