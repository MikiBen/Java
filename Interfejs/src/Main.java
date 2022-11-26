public class Main {
    public static void main(String[] args) {

        System.out.println("START");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("watek1: " + i);
                    try {Thread.sleep(1000);} catch (InterruptedException e) {}
                }
            }
        });
        thread.start();

        try {thread.join();} catch (InterruptedException e) {}
        System.out.println("STOP");
    }
}