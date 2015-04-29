package com.local.thread;

public class ThreadExample {

	static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.print( System.currentTimeMillis()/1000);
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }

    private static class MessageLoop
        implements Runnable {
        public void run() {
            String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };
            threadMessage(importantInfo[1]);
          /*  try {
                for (int i = 0;
                     i < importantInfo.length;
                     i++) {
                    // Pause for 4 seconds
                	threadMessage(importantInfo[i]);
                    Thread.sleep(4000);
                    // Print a message
                    
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }*/
        }
    }
    
    private static class MessageLoop2
    implements Runnable {
    public void run() {
        String importantInfo[] = {
            "Mares eat oats2",
            "Does eat oats2",
            "Little lambs eat ivy2",
            "A kid will eat ivy too2"
        };
        
        threadMessage(importantInfo[0]);
        /*try {
            for (int i = 0;
                 i < importantInfo.length;
                 i++) {
                // Pause for 4 seconds
            	threadMessage(importantInfo[i]);
                Thread.sleep(4000);
                // Print a message
                
            }
        } catch (InterruptedException e) {
            threadMessage("I wasn't done!");
        }*/
    }
}

    public static void main(String args[])
        throws InterruptedException {

        // Delay, in milliseconds before
        // we interrupt MessageLoop
        // thread (default one hour).
        long patience = 1000 * 60 * 60;

        // If command line argument
        // present, gives patience
        // in seconds.
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        Thread t2 = new Thread(new MessageLoop2());
        t.start();
        t2.start();
        System.out.println("Started Both thread");
        t2.wait();
        System.out.println("Ask t2 to wait");
        t.wait();
        System.out.println("Started Both thread");
        threadMessage("Waiting for MessageLoop thread to finish");
        // loop until MessageLoop
        // thread exits
        t2.notifyAll();
        t.notify();
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Wait maximum of 1 second
            // for MessageLoop thread
            // to finish.
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > 2000)
                  && t.isAlive()) {
                threadMessage("Tired of waiting!");                
               // t.interrupt();
                
                threadMessage("Intrupted the running thread");  
                // Shouldn't be long now
                // -- wait indefinitely
                t.join();
                threadMessage("join running thread");  
            }
        }
        threadMessage("Finally!");
    }
}
