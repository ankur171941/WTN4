package WiproTalentNext4.Threads;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class producerConsumer {
    public static void main(String[] args) throws InterruptedException {
        final procon pc = new procon();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException it) {

                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException it) {

                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
class procon {
    LinkedList<Integer> l = new LinkedList<Integer>();
    int cap = 5;

    public void produce() throws InterruptedException {


    int v=0;
     while(true)
     {
         synchronized (this)
         {
             while(l.size() == cap)
             wait();
             System.out.println("producer produces"+v);
             l.add(v++);
             notify();//to tell other threads to resume
             Thread.sleep(500);
         }
     }

}
public void consume() throws InterruptedException
{
    int val;
    while(true)
    {
        synchronized (this)
        {
            while(l.size() == 0)
                wait();
            val = l.removeFirst();
            System.out.println("consumer Consumed" + val);
            notify();
            Thread.sleep(500);


        }
    }
}
}
