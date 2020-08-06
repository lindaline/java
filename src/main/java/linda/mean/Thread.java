package linda.mean;


public abstract class Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
        }
        java.lang.Thread thread = new java.lang.Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread:" + i);
                }
            }
        };
        thread.start();
        MyThread myThread = new MyThread();
        myThread.run();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runnable:" + i);
                }
            }
        };
        java.lang.Thread r = new java.lang.Thread(runnable);
        r.start();
        System.out.println("main end");
    }

    public abstract void run();
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getClass() + ":" + i);
        }
    }
}