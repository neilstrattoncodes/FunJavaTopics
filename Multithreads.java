package JavaConcepts;

public class Multithreads extends Thread {

    /* multithreads allow for multiple different paths or threads of code to run
    at the same time. Overriding the run method from Thread Class as example.
     */

    private int threadNumber;
    public Multithreads(int threadNumber) {  //used to create thread number
        this.threadNumber = threadNumber;

    }

    @Override
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(i +  " from thread" + threadNumber);

            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
            }

        }
    }
}
