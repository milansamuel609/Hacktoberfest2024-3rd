// I have shown and implemented the concept of threading in java with the help of below simple output code

class myThread implements Runnable
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        for(int i = 1; i < 10; i++){
            System.out.println(name+i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
        }
    }
}

class ThreadingJava{
    public static void main(String[] args){
        myThread obj1 = new myThread();
        myThread obj2 = new myThread();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        t1.setName("First");
        t2.setName("Second");
    }
}
