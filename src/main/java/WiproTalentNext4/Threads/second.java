package WiproTalentNext4.Threads;

class table {
    synchronized void printtable(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {

            }
        }
    }
}
class mythread1 extends Thread
{
    table t;
    mythread1(table t1)
    {
        t=t1;
    }
    public void run()
    {
        t.printtable(5);
    }
}
    class mythread2 extends Thread
    {
        table t;
        mythread2(table t1)
        {
            t=t1;
        }
        public void run()
        {
            t.printtable(8);
        }
    }

public class second {
    public static void main(String[] args)
    {
        table ta = new table();
        mythread1 m1 = new mythread1(ta);
        mythread2 m2 = new mythread2(ta);
        m1.start();
        m2.start();

    }
}
